/*
 Navicat MySQL Data Transfer

 Source Server         : MySQL
 Source Server Type    : MySQL
 Source Server Version : 50720
 Source Host           : localhost:3306
 Source Schema         : online-supermarket

 Target Server Type    : MySQL
 Target Server Version : 50720
 File Encoding         : 65001

 Date: 16/11/2018 17:57:51
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for address
-- ----------------------------
DROP TABLE IF EXISTS `address`;
CREATE TABLE `address`  (
  `id` int(11) UNSIGNED NOT NULL AUTO_INCREMENT COMMENT '地址id',
  `user_id` int(11) UNSIGNED NOT NULL COMMENT '用户id',
  `address` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '街道地址',
  `name` varchar(18) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '收件人姓名',
  `telephone` varchar(11) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '收件人电话号码',
  `postcode` varchar(6) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '邮政编码',
  `create_time` datetime(0) NOT NULL COMMENT '创建时间',
  `delete_time` datetime(0) NULL DEFAULT NULL COMMENT '删除时间',
  `delete_status` int(11) UNSIGNED NOT NULL DEFAULT 1 COMMENT '数据删除状态 1-正常 2-删除',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 9 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of address
-- ----------------------------
INSERT INTO `address` VALUES (1, 1, 'n. 形状；模型；身材；具体化\nvt. 形成；塑造，使成形；使符合\nvi. 形成；成形；成长\nn. (Shape)人名；(瑞典)沙佩', 'magnet', 'magnet', 'shape', '2018-11-13 17:02:31', NULL, 2);
INSERT INTO `address` VALUES (2, 1, 'update address', 'buii', '23223423', '444444', '2018-11-13 17:02:31', NULL, 1);
INSERT INTO `address` VALUES (3, 1, 'si chuan shen cheng du shi jin jiang qu shui mu hua xia!', 'buii', '23223423', '444444', '2018-11-13 17:02:50', NULL, 1);
INSERT INTO `address` VALUES (4, 1, 'si chuan shen cheng du shi jin jiang qu shui mu hua xia!', 'buii', '23223423', '444444', '2018-11-13 17:02:50', NULL, 1);
INSERT INTO `address` VALUES (5, 1, 'si chuan shen cheng du shi jin jiang qu shui mu hua xia!', 'buii', '23223423', '444444', '2018-11-13 17:03:55', NULL, 1);
INSERT INTO `address` VALUES (6, 1, 'si chuan shen cheng du shi jin jiang qu shui mu hua xia!', 'buii', '23223423', '444444', '2018-11-13 17:03:55', NULL, 1);
INSERT INTO `address` VALUES (7, 1, 'n. 形状；模型；身材；具体化\nvt. 形成；塑造，使成形；使符合\nvi. 形成；成形；成长\nn. (Shape)人名；(瑞典)沙佩', 'shape', 'n. 磁铁', 'magnet', '2018-11-15 10:56:04', NULL, 1);
INSERT INTO `address` VALUES (8, 1, 'n. 形状；模型；身材；具体化\nvt. 形成；塑造，使成形；使符合\nvi. 形成；成形；成长\nn. (Shape)人名；(瑞典)沙佩', 'shape', 'n. 磁铁', 'magnet', '2018-11-15 11:09:36', NULL, 1);

-- ----------------------------
-- Table structure for after_sale
-- ----------------------------
DROP TABLE IF EXISTS `after_sale`;
CREATE TABLE `after_sale`  (
  `id` int(11) UNSIGNED NOT NULL AUTO_INCREMENT COMMENT '售后申请id',
  `order_sku_id` int(11) UNSIGNED NOT NULL COMMENT '退货sku的id',
  `user_id` int(11) NOT NULL COMMENT '所属买家id',
  `store_id` int(11) UNSIGNED NOT NULL COMMENT '店家id',
  `cause` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '售后原因',
  `result` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '售后申请结果',
  `method` int(11) UNSIGNED NOT NULL COMMENT '售后方式 1-仅退款 2-退货退款',
  `status` int(11) UNSIGNED NOT NULL COMMENT '售后状态 1-申请售后 2-寄回货物（如有） 3-卖家收货并退款',
  `express_detail` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '退货快递信息 json格式',
  `create_time` datetime(0) NOT NULL COMMENT '创建时间',
  `delete_time` datetime(0) NULL DEFAULT NULL COMMENT '删除时间',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 3 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of after_sale
-- ----------------------------
INSERT INTO `after_sale` VALUES (1, 3, 1, 0, '退钱', NULL, 2, 1, NULL, '2018-11-13 17:34:46', NULL);
INSERT INTO `after_sale` VALUES (2, 3, 1, 0, '退钱', NULL, 2, 2, NULL, '2018-11-13 17:34:46', NULL);

-- ----------------------------
-- Table structure for attr
-- ----------------------------
DROP TABLE IF EXISTS `attr`;
CREATE TABLE `attr`  (
  `id` int(11) UNSIGNED NOT NULL AUTO_INCREMENT COMMENT '属性id',
  `name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '属性名称',
  `category_id` int(11) UNSIGNED NOT NULL COMMENT '分类id',
  `is_sku` int(11) UNSIGNED NOT NULL DEFAULT 2 COMMENT '是否为sku属性 1-是，2-否',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 3 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of attr
-- ----------------------------
INSERT INTO `attr` VALUES (1, 'color', 2, 2);
INSERT INTO `attr` VALUES (2, 'color', 2, 1);

-- ----------------------------
-- Table structure for attr_value
-- ----------------------------
DROP TABLE IF EXISTS `attr_value`;
CREATE TABLE `attr_value`  (
  `id` int(11) UNSIGNED NOT NULL AUTO_INCREMENT COMMENT '属性值id',
  `attr_id` int(11) UNSIGNED NULL DEFAULT NULL COMMENT '属性id',
  `name` varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '属性值名称',
  `goods_id` int(11) UNSIGNED NULL DEFAULT NULL COMMENT '商品id',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 3 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of attr_value
-- ----------------------------
INSERT INTO `attr_value` VALUES (1, 2, 'yellow', 2);
INSERT INTO `attr_value` VALUES (2, 2, 'black', 2);

-- ----------------------------
-- Table structure for category
-- ----------------------------
DROP TABLE IF EXISTS `category`;
CREATE TABLE `category`  (
  `id` int(11) UNSIGNED NOT NULL AUTO_INCREMENT COMMENT '商品类别id',
  `name` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '商品类别名称',
  `parent_id` int(11) UNSIGNED NOT NULL COMMENT '父类别id ，id=0时表示根节点，一级类别',
  `delete_status` int(11) UNSIGNED NOT NULL DEFAULT 1 COMMENT '类别状态 1-正常，2-废除',
  `level` int(11) UNSIGNED NOT NULL DEFAULT 1 COMMENT '商品类别id',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 4 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of category
-- ----------------------------
INSERT INTO `category` VALUES (1, 'buyi', 2, 1, 1);
INSERT INTO `category` VALUES (2, 'buyi', 2, 2, 1);
INSERT INTO `category` VALUES (3, 'buyi', 2, 1, 1);

-- ----------------------------
-- Table structure for goods
-- ----------------------------
DROP TABLE IF EXISTS `goods`;
CREATE TABLE `goods`  (
  `id` int(11) UNSIGNED NOT NULL AUTO_INCREMENT COMMENT '商品id',
  `category_id` int(11) UNSIGNED NOT NULL COMMENT '类别id',
  `name` varchar(60) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '商品名称',
  `store_id` int(11) UNSIGNED NOT NULL COMMENT '店铺id',
  `trademark_id` int(11) UNSIGNED NULL DEFAULT NULL COMMENT '品牌id',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 3 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of goods
-- ----------------------------
INSERT INTO `goods` VALUES (1, 2, 'vivo nex', 1, 1);
INSERT INTO `goods` VALUES (2, 2, 'vivo nex', 1, 1);

-- ----------------------------
-- Table structure for order
-- ----------------------------
DROP TABLE IF EXISTS `order`;
CREATE TABLE `order`  (
  `id` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '订单编号',
  `user_id` int(11) UNSIGNED NOT NULL COMMENT '买家id',
  `store_id` int(11) UNSIGNED NOT NULL COMMENT '商店id',
  `name` varchar(60) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '订单简要说明',
  `sum` decimal(20, 2) UNSIGNED NOT NULL COMMENT '订单总金额',
  `status` int(11) UNSIGNED NOT NULL DEFAULT 1 COMMENT '订单状态',
  `address` varchar(120) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '订单详细地址 json格式',
  `express_num` varchar(24) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '快递单号',
  `pay_method` int(11) UNSIGNED NULL DEFAULT NULL COMMENT '付款方式id',
  `create_time` datetime(0) NOT NULL COMMENT '创建时间',
  `delete_time` datetime(0) NULL DEFAULT NULL COMMENT '删除时间'
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of order
-- ----------------------------
INSERT INTO `order` VALUES ('', 1, 1, 'oppo find x', 3000.00, 1, '四川省成都市锦江区天府三街腾讯大厦B座 19983145689 666666 布衣', NULL, NULL, '2018-11-14 15:55:46', NULL);
INSERT INTO `order` VALUES ('', 1, 1, 'oppo find x', 3000.00, 1, '四川省成都市锦江区天府三街腾讯大厦B座 19983145689 666666 布衣', NULL, NULL, '2018-11-14 15:55:46', NULL);
INSERT INTO `order` VALUES ('', 1, 1, 'oppo find x', 3000.00, 1, '四川省成都市锦江区天府三街腾讯大厦B座 19983145689 666666 布衣', NULL, NULL, '2018-11-15 18:04:59', NULL);
INSERT INTO `order` VALUES ('', 1, 1, 'oppo find x', 3000.00, 1, '四川省成都市锦江区天府三街腾讯大厦B座 19983145689 666666 布衣', NULL, NULL, '2018-11-15 18:05:54', NULL);
INSERT INTO `order` VALUES ('', 1, 1, 'oppo find x', 3000.00, 1, '四川省成都市锦江区天府三街腾讯大厦B座 19983145689 666666 布衣', NULL, NULL, '2018-11-15 18:07:04', NULL);
INSERT INTO `order` VALUES ('20181116140538129-0001', 1, 1, 'oppo find x', 3000.00, 1, '四川省成都市锦江区天府三街腾讯大厦B座 19983145689 666666 布衣', NULL, NULL, '2018-11-16 14:05:38', NULL);

-- ----------------------------
-- Table structure for order_sku
-- ----------------------------
DROP TABLE IF EXISTS `order_sku`;
CREATE TABLE `order_sku`  (
  `id` int(11) UNSIGNED NOT NULL AUTO_INCREMENT COMMENT '购买商品备份id',
  `order_id` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '订单编号',
  `goods_id` int(11) UNSIGNED NOT NULL COMMENT '购买商品id',
  `goods_name` varchar(60) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '购买商品名称',
  `sku_count` int(11) UNSIGNED NOT NULL COMMENT '购买商品数量',
  `sku_price` decimal(20, 2) UNSIGNED NOT NULL COMMENT '购买商品单价',
  `sku_sum` decimal(20, 2) NOT NULL COMMENT '购买商品总金额',
  `sku_detail` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '购买商品sku详细信息',
  `after_sale` int(11) UNSIGNED NOT NULL DEFAULT 1 COMMENT '售后状态 1-正常 2-售后申请中 3-退款成功',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 4 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of order_sku
-- ----------------------------
INSERT INTO `order_sku` VALUES (1, '1', 1, 'oppo find x', 3, 3000.00, 9000.00, 'yellow; 8G+128G; made in china', 1);
INSERT INTO `order_sku` VALUES (2, '1', 1, 'oppo find x', 3, 3000.00, 9000.00, 'yellow; 8G+128G; made in china', 1);
INSERT INTO `order_sku` VALUES (3, '20181116141317702-0001', 1, 'oppo find x', 3, 3000.00, 9000.00, 'yellow; 8G+128G; made in china', 1);

-- ----------------------------
-- Table structure for sku
-- ----------------------------
DROP TABLE IF EXISTS `sku`;
CREATE TABLE `sku`  (
  `id` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT 'SKU 编号',
  `goods_id` int(11) UNSIGNED NOT NULL COMMENT '商品id',
  `sku_attr` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT 'sku属性键值对  attr_id : value_id;   attr_id : avlue_id',
  `price` decimal(20, 2) UNSIGNED NOT NULL COMMENT 'SKU 价格',
  `count` int(11) UNSIGNED NOT NULL COMMENT '库存',
  `detail` varchar(60) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '组成sku的属性描述',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of sku
-- ----------------------------
INSERT INTO `sku` VALUES ('1', 1, '2:3,4:4,5:5,6:4', 3000.00, 200, '');
INSERT INTO `sku` VALUES ('2', 1, '2:3,4:4,5:5,6:4', 3000.00, 200, '');
INSERT INTO `sku` VALUES ('20181116170717418-0001', 1, '2:3,4:4,5:5,6:4', 3000.00, 200, 'yellow ');
INSERT INTO `sku` VALUES ('3', 1, '2:3,4:4,5:5,6:4', 3000.00, 200, 'yellow ');

-- ----------------------------
-- Table structure for sku_attr
-- ----------------------------
DROP TABLE IF EXISTS `sku_attr`;
CREATE TABLE `sku_attr`  (
  `id` int(11) UNSIGNED NOT NULL AUTO_INCREMENT,
  `attr_id` int(11) UNSIGNED NOT NULL COMMENT '属性id',
  `attr_value_id` int(11) UNSIGNED NOT NULL COMMENT '属性值id',
  `sku_id` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT 'sku id',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 3 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of sku_attr
-- ----------------------------
INSERT INTO `sku_attr` VALUES (1, 1, 1, '1');
INSERT INTO `sku_attr` VALUES (2, 1, 1, '1');

-- ----------------------------
-- Table structure for store
-- ----------------------------
DROP TABLE IF EXISTS `store`;
CREATE TABLE `store`  (
  `id` int(11) UNSIGNED NOT NULL AUTO_INCREMENT COMMENT '店铺id',
  `name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '店铺名称',
  `user_id` int(11) UNSIGNED NOT NULL COMMENT '用户id',
  `status` int(11) UNSIGNED NOT NULL COMMENT '店铺状态 1-正常 2-关闭',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 3 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of store
-- ----------------------------
INSERT INTO `store` VALUES (1, 'small store', 1, 1);
INSERT INTO `store` VALUES (2, 'small store', 2, 1);

-- ----------------------------
-- Table structure for trademark
-- ----------------------------
DROP TABLE IF EXISTS `trademark`;
CREATE TABLE `trademark`  (
  `id` int(11) UNSIGNED NOT NULL AUTO_INCREMENT COMMENT '品牌id',
  `name` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '品牌名称',
  `logo_url` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '品牌logo地址',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 3 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of trademark
-- ----------------------------
INSERT INTO `trademark` VALUES (1, 'trademark', 'c;//picture/1.png');
INSERT INTO `trademark` VALUES (2, 'trademark name', 'c;//picture/1.png');

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user`  (
  `id` int(11) UNSIGNED NOT NULL AUTO_INCREMENT COMMENT '用户id',
  `name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '用户名称',
  `password` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '用户密码',
  `telephone` varchar(18) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '用户电话号码',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 6 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES (1, 'buyiupdate', 'sergs', '14q23434');
INSERT INTO `user` VALUES (2, 'buyi', 'sergs', '14q23434');
INSERT INTO `user` VALUES (3, 'buyi', 'sergs', '14q23434');
INSERT INTO `user` VALUES (4, 'buyi', 'sergs', '14q23434');
INSERT INTO `user` VALUES (5, 'buyi', 'sergs', '14q23434');

SET FOREIGN_KEY_CHECKS = 1;
