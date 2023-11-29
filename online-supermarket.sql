/*
 Navicat Premium Data Transfer

 Source Server         : localhost-mysql5.7-3306
 Source Server Type    : MySQL
 Source Server Version : 50720 (5.7.20)
 Source Host           : localhost:3306
 Source Schema         : online-supermarket

 Target Server Type    : MySQL
 Target Server Version : 50720 (5.7.20)
 File Encoding         : 65001

 Date: 29/11/2023 14:58:56
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
  `postcode` varchar(6) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '0' COMMENT '邮政编码',
  `create_time` datetime NOT NULL COMMENT '创建时间',
  `delete_time` datetime NULL DEFAULT NULL COMMENT '删除时间',
  `delete_status` int(11) UNSIGNED NOT NULL DEFAULT 1 COMMENT '数据删除状态 1-正常 2-删除',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 20 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

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
INSERT INTO `address` VALUES (9, 1, 'faewfjoweijfeoi', 'buyi', '13158503013', '', '2018-11-27 12:22:07', NULL, 1);
INSERT INTO `address` VALUES (10, 1, 'faewfjoweijfeoi', 'buyi', '13158503013', '', '2018-11-27 12:25:41', NULL, 1);
INSERT INTO `address` VALUES (11, 1, 'faewfjoweijfeoi', 'buyi', '13158503013', '000000', '2018-11-27 12:26:58', NULL, 1);
INSERT INTO `address` VALUES (12, 1, 'n. 形状；模型；身材；具体化\nvt. 形成；塑造，使成形；使符合\nvi. 形成；成形；成长\nn. (Shape)人名；(瑞典)沙佩', 'shape', 'n. 磁铁', 'magnet', '2018-11-30 09:53:46', NULL, 1);
INSERT INTO `address` VALUES (13, 1, 'n. 形状；模型；身材；具体化\nvt. 形成；塑造，使成形；使符合\nvi. 形成；成形；成长\nn. (Shape)人名；(瑞典)沙佩', 'shape', 'n. 磁铁', 'magnet', '2018-11-30 11:03:23', NULL, 1);
INSERT INTO `address` VALUES (14, 1, 'n. 形状；模型；身材；具体化\nvt. 形成；塑造，使成形；使符合\nvi. 形成；成形；成长\nn. (Shape)人名；(瑞典)沙佩', 'shape', 'n. 磁铁', 'magnet', '2018-11-30 11:10:59', NULL, 1);
INSERT INTO `address` VALUES (15, 1, 'n. 形状；模型；身材；具体化\nvt. 形成；塑造，使成形；使符合\nvi. 形成；成形；成长\nn. (Shape)人名；(瑞典)沙佩', 'shape', 'n. 磁铁', 'magnet', '2018-11-30 11:14:03', NULL, 1);
INSERT INTO `address` VALUES (16, 1, 'n. 形状；模型；身材；具体化\nvt. 形成；塑造，使成形；使符合\nvi. 形成；成形；成长\nn. (Shape)人名；(瑞典)沙佩', 'shape', 'n. 磁铁', 'magnet', '2018-11-30 11:16:44', NULL, 1);
INSERT INTO `address` VALUES (17, 1, 'n. 形状；模型；身材；具体化\nvt. 形成；塑造，使成形；使符合\nvi. 形成；成形；成长\nn. (Shape)人名；(瑞典)沙佩', 'shape', 'n. 磁铁', 'magnet', '2018-11-30 13:26:16', NULL, 1);
INSERT INTO `address` VALUES (18, 1, 'n. 形状；模型；身材；具体化\nvt. 形成；塑造，使成形；使符合\nvi. 形成；成形；成长\nn. (Shape)人名；(瑞典)沙佩', 'shape', 'n. 磁铁', 'magnet', '2018-11-30 13:55:40', NULL, 1);
INSERT INTO `address` VALUES (19, 1, 'n. 形状；模型；身材；具体化\nvt. 形成；塑造，使成形；使符合\nvi. 形成；成形；成长\nn. (Shape)人名；(瑞典)沙佩', 'shape', 'n. 磁铁', 'magnet', '2018-11-30 14:01:48', NULL, 1);

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
  `create_time` datetime NOT NULL COMMENT '创建时间',
  `delete_time` datetime NULL DEFAULT NULL COMMENT '删除时间',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 14 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of after_sale
-- ----------------------------
INSERT INTO `after_sale` VALUES (1, 3, 1, 1, '退钱', '同意售后', 2, 203, '23452524262465635635656', '2018-11-13 17:34:46', NULL);
INSERT INTO `after_sale` VALUES (2, 3, 1, 1, '退钱', NULL, 2, 2, NULL, '2018-11-13 17:34:46', NULL);
INSERT INTO `after_sale` VALUES (3, 1, 1, 1, '未收到货', NULL, 1, 100, NULL, '2018-11-27 14:34:23', NULL);
INSERT INTO `after_sale` VALUES (4, 1, 1, 1, '未收到货', NULL, 1, 100, NULL, '2018-11-27 15:34:03', NULL);
INSERT INTO `after_sale` VALUES (5, 1, 1, 1, '未收到货', NULL, 1, 100, NULL, '2018-11-27 16:41:41', NULL);
INSERT INTO `after_sale` VALUES (6, 3, 1, 1, '退钱', NULL, 2, 1, NULL, '2018-11-30 09:53:44', NULL);
INSERT INTO `after_sale` VALUES (7, 3, 1, 1, '退钱', NULL, 2, 1, NULL, '2018-11-30 11:03:21', NULL);
INSERT INTO `after_sale` VALUES (8, 3, 1, 1, '退钱', NULL, 2, 1, NULL, '2018-11-30 11:10:58', NULL);
INSERT INTO `after_sale` VALUES (9, 3, 1, 1, '退钱', NULL, 2, 1, NULL, '2018-11-30 11:14:02', NULL);
INSERT INTO `after_sale` VALUES (10, 3, 1, 1, '退钱', NULL, 2, 1, NULL, '2018-11-30 11:16:42', NULL);
INSERT INTO `after_sale` VALUES (11, 3, 1, 1, '退钱', NULL, 2, 1, NULL, '2018-11-30 13:26:14', NULL);
INSERT INTO `after_sale` VALUES (12, 3, 1, 1, '退钱', NULL, 2, 1, NULL, '2018-11-30 13:55:39', NULL);
INSERT INTO `after_sale` VALUES (13, 3, 1, 1, '退钱', NULL, 2, 1, NULL, '2018-11-30 14:01:46', NULL);

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
) ENGINE = InnoDB AUTO_INCREMENT = 25 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of attr
-- ----------------------------
INSERT INTO `attr` VALUES (1, 'color', 2, 2);
INSERT INTO `attr` VALUES (2, 'color', 2, 1);
INSERT INTO `attr` VALUES (3, 'color', 2, 1);
INSERT INTO `attr` VALUES (4, 'color', 2, 1);
INSERT INTO `attr` VALUES (5, 'color', 2, 1);
INSERT INTO `attr` VALUES (6, 'color', 2, 1);
INSERT INTO `attr` VALUES (7, 'color', 2, 1);
INSERT INTO `attr` VALUES (8, 'color', 2, 1);
INSERT INTO `attr` VALUES (10, 'afwefw', 5, 2);
INSERT INTO `attr` VALUES (11, '颜色', 5, 2);
INSERT INTO `attr` VALUES (12, '内存容量', 5, 2);
INSERT INTO `attr` VALUES (13, '按个人', 5, 1);
INSERT INTO `attr` VALUES (14, '我刚发', 5, 2);
INSERT INTO `attr` VALUES (15, '阿尔戈', 11, 2);
INSERT INTO `attr` VALUES (16, '日嘎', 11, 1);
INSERT INTO `attr` VALUES (17, '尺码', 59, 1);
INSERT INTO `attr` VALUES (18, '尺码', 60, 2);
INSERT INTO `attr` VALUES (23, '尺码', 61, 1);
INSERT INTO `attr` VALUES (24, '尺码', 62, 1);

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
) ENGINE = InnoDB AUTO_INCREMENT = 25 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of attr_value
-- ----------------------------
INSERT INTO `attr_value` VALUES (1, 2, 'yellow', 2);
INSERT INTO `attr_value` VALUES (2, 2, 'black', 2);
INSERT INTO `attr_value` VALUES (3, 0, 'name0', 0);
INSERT INTO `attr_value` VALUES (4, 1, 'name1', 1);
INSERT INTO `attr_value` VALUES (5, 0, 'name0', 0);
INSERT INTO `attr_value` VALUES (6, 1, 'name1', 1);
INSERT INTO `attr_value` VALUES (7, 1, 'n', 2);
INSERT INTO `attr_value` VALUES (8, 1, 'n', 2);
INSERT INTO `attr_value` VALUES (9, 0, 'name0', 0);
INSERT INTO `attr_value` VALUES (10, 1, 'name1', 1);
INSERT INTO `attr_value` VALUES (11, 0, 'name0', 0);
INSERT INTO `attr_value` VALUES (12, 1, 'name1', 1);
INSERT INTO `attr_value` VALUES (13, 0, 'name0', 0);
INSERT INTO `attr_value` VALUES (14, 1, 'name1', 1);
INSERT INTO `attr_value` VALUES (15, 0, 'name0', 0);
INSERT INTO `attr_value` VALUES (16, 1, 'name1', 1);
INSERT INTO `attr_value` VALUES (17, 0, 'name0', 0);
INSERT INTO `attr_value` VALUES (18, 1, 'name1', 1);
INSERT INTO `attr_value` VALUES (19, 0, 'name0', 0);
INSERT INTO `attr_value` VALUES (20, 1, 'name1', 1);
INSERT INTO `attr_value` VALUES (21, 0, 'name0', 0);
INSERT INTO `attr_value` VALUES (22, 1, 'name1', 1);
INSERT INTO `attr_value` VALUES (23, 0, 'name0', 0);
INSERT INTO `attr_value` VALUES (24, 1, 'name1', 1);

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
) ENGINE = InnoDB AUTO_INCREMENT = 79 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of category
-- ----------------------------
INSERT INTO `category` VALUES (1, 'buyi', 2, 2, 1);
INSERT INTO `category` VALUES (2, 'buyi', 2, 2, 1);
INSERT INTO `category` VALUES (3, 'buyi', 2, 2, 1);
INSERT INTO `category` VALUES (4, 'computer', 0, 2, 1);
INSERT INTO `category` VALUES (5, 'computer', 0, 2, 1);
INSERT INTO `category` VALUES (6, 'faoefj', 1, 2, 1);
INSERT INTO `category` VALUES (7, '哈哈费', 3, 2, 2);
INSERT INTO `category` VALUES (8, 'gerfgawe', 4, 2, 2);
INSERT INTO `category` VALUES (9, '发违法为发', 0, 2, 1);
INSERT INTO `category` VALUES (10, '发违法为发', 4, 2, 2);
INSERT INTO `category` VALUES (11, '二个人', 0, 2, 1);
INSERT INTO `category` VALUES (16, '大范围', 3, 2, 2);
INSERT INTO `category` VALUES (17, '大范围', 11, 1, 2);
INSERT INTO `category` VALUES (53, 'zvrgr', 3, 2, 2);
INSERT INTO `category` VALUES (54, 'zvrgr', 3, 2, 2);
INSERT INTO `category` VALUES (55, 'zvrgr', 3, 1, 2);
INSERT INTO `category` VALUES (56, 'buyi', 2, 2, 1);
INSERT INTO `category` VALUES (57, 'buyi', 2, 2, 1);
INSERT INTO `category` VALUES (58, 'buyi', 2, 1, 1);
INSERT INTO `category` VALUES (59, '女装', 0, 1, 1);
INSERT INTO `category` VALUES (60, '男装', 0, 1, 1);
INSERT INTO `category` VALUES (61, '内衣', 0, 1, 1);
INSERT INTO `category` VALUES (62, '鞋靴', 0, 1, 1);
INSERT INTO `category` VALUES (63, '箱包', 0, 1, 1);
INSERT INTO `category` VALUES (64, '配件', 0, 1, 1);
INSERT INTO `category` VALUES (65, '童装玩具', 0, 1, 1);
INSERT INTO `category` VALUES (66, '孕产', 0, 1, 1);
INSERT INTO `category` VALUES (67, '用品', 0, 1, 1);
INSERT INTO `category` VALUES (68, '家电', 0, 1, 1);
INSERT INTO `category` VALUES (69, '数码', 0, 1, 1);
INSERT INTO `category` VALUES (70, '手机', 0, 1, 1);
INSERT INTO `category` VALUES (71, '美妆', 0, 1, 1);
INSERT INTO `category` VALUES (72, '洗护', 0, 1, 1);
INSERT INTO `category` VALUES (73, '保健品', 0, 1, 1);
INSERT INTO `category` VALUES (74, '珠宝', 0, 1, 1);
INSERT INTO `category` VALUES (75, '皮草', 59, 1, 2);
INSERT INTO `category` VALUES (76, '毛衣', 59, 1, 2);
INSERT INTO `category` VALUES (77, '裤子', 59, 1, 2);
INSERT INTO `category` VALUES (78, '半身裙', 59, 1, 2);

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
) ENGINE = InnoDB AUTO_INCREMENT = 5 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of goods
-- ----------------------------
INSERT INTO `goods` VALUES (1, 2, 'vivo nex', 1, 1);
INSERT INTO `goods` VALUES (2, 1, 'vivo nex', 1, 1);
INSERT INTO `goods` VALUES (3, 1, 'computer', 1, 1);
INSERT INTO `goods` VALUES (4, 1, 'computer', 1, NULL);

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
  `create_time` datetime NOT NULL COMMENT '创建时间',
  `delete_time` datetime NULL DEFAULT NULL COMMENT '删除时间'
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of order
-- ----------------------------
INSERT INTO `order` VALUES ('1', 1, 1, 'oppo find x', 3000.00, 1, '四川省成都市锦江区天府三街腾讯大厦B座 19983145689 666666 布衣', NULL, NULL, '2018-11-15 18:07:04', NULL);
INSERT INTO `order` VALUES ('20181116140538129-0001', 1, 1, 'oppo find x', 3000.00, 1, '四川省成都市锦江区天府三街腾讯大厦B座 19983145689 666666 布衣', NULL, NULL, '2018-11-16 14:05:38', NULL);
INSERT INTO `order` VALUES ('20181130095345692518442550618', 1, 1, 'oppo find x', 3000.00, 1, '四川省成都市锦江区天府三街腾讯大厦B座 19983145689 666666 布衣', NULL, NULL, '2018-11-30 09:53:45', NULL);
INSERT INTO `order` VALUES ('20181130110322696695453257121', 1, 1, 'oppo find x', 3000.00, 1, '四川省成都市锦江区天府三街腾讯大厦B座 19983145689 666666 布衣', NULL, NULL, '2018-11-30 11:03:22', NULL);
INSERT INTO `order` VALUES ('20181130111058697151823542811', 1, 1, 'oppo find x', 3000.00, 1, '四川省成都市锦江区天府三街腾讯大厦B座 19983145689 666666 布衣', NULL, NULL, '2018-11-30 11:10:58', NULL);
INSERT INTO `order` VALUES ('20181130111403697336151708075', 1, 1, 'oppo find x', 3000.00, 1, '四川省成都市锦江区天府三街腾讯大厦B座 19983145689 666666 布衣', NULL, NULL, '2018-11-30 11:14:03', NULL);
INSERT INTO `order` VALUES ('20181130111643697496608415551', 1, 1, 'oppo find x', 3000.00, 1, '四川省成都市锦江区天府三街腾讯大厦B座 19983145689 666666 布衣', NULL, NULL, '2018-11-30 11:16:43', NULL);
INSERT INTO `order` VALUES ('20181130132614705267885750403', 1, 1, 'oppo find x', 3000.00, 1, '四川省成都市锦江区天府三街腾讯大厦B座 19983145689 666666 布衣', NULL, NULL, '2018-11-30 13:26:14', NULL);
INSERT INTO `order` VALUES ('20181130135539707032743027356', 1, 1, 'oppo find x', 3000.00, 1, '四川省成都市锦江区天府三街腾讯大厦B座 19983145689 666666 布衣', NULL, NULL, '2018-11-30 13:55:39', NULL);
INSERT INTO `order` VALUES ('20181130140147707400307866880', 1, 1, 'oppo find x', 3000.00, 1, '四川省成都市锦江区天府三街腾讯大厦B座 19983145689 666666 布衣', NULL, NULL, '2018-11-30 14:01:47', NULL);

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
INSERT INTO `sku` VALUES ('20181128114619526468082498571', 1, '[{\'attrId\':1,\'attrName\':\'buyi\',\'valueId\':2,\'valueName\':\'hh\'}]', 300.00, 2, '黄色, 64G');
INSERT INTO `sku` VALUES ('20181128114619526468087387250', 1, '[{\'attrId\':1,\'attrName\':\'buyi\',\'valueId\':2,\'valueName\':\'hh\'}]', 300.00, 2, '黄色, 64G');
INSERT INTO `sku` VALUES ('20181128114735526544199659724', 1, '[{\'attrId\':1,\'attrName\':\'buyi\',\'valueId\':2,\'valueName\':\'hh\'}]', 300.00, 2, '黄色, 64G');
INSERT INTO `sku` VALUES ('20181128114735526544211661036', 1, '[{\'attrId\':1,\'attrName\':\'buyi\',\'valueId\':2,\'valueName\':\'hh\'}]', 300.00, 30, '黄色, 64G');
INSERT INTO `sku` VALUES ('20181128131108531557730319400', 1, '[{\'attrId\':1,\'attrName\':\'buyi\',\'valueId\':2,\'valueName\':\'hh\'}]', 300.00, 2, '黄色, 64G');
INSERT INTO `sku` VALUES ('20181128131108531557736980683', 1, '[{\'attrId\':1,\'attrName\':\'buyi\',\'valueId\':2,\'valueName\':\'hh\'}]', 300.00, 2, '黄色, 64G');
INSERT INTO `sku` VALUES ('20181130095345692518767005648', 1, '2:3,4:4,5:5,6:4', 3000.00, 200, 'yellow ');
INSERT INTO `sku` VALUES ('20181130095345692518767094155', 1, '2:3,4:4,5:5,6:4', 3000.00, 200, 'yellow ');
INSERT INTO `sku` VALUES ('20181130095345692518767123070', 1, '2:3,4:4,5:5,6:4', 3000.00, 200, 'yellow ');
INSERT INTO `sku` VALUES ('20181130095345692518815832492', 1, '2:3,4:4,5:5,6:4', 3000.00, 200, 'yellow ');
INSERT INTO `sku` VALUES ('20181130110322696695793865526', 1, '2:3,4:4,5:5,6:4', 3000.00, 200, 'yellow ');
INSERT INTO `sku` VALUES ('20181130110322696695793928997', 1, '2:3,4:4,5:5,6:4', 3000.00, 200, 'yellow ');
INSERT INTO `sku` VALUES ('20181130110322696695793958616', 1, '2:3,4:4,5:5,6:4', 3000.00, 200, 'yellow ');
INSERT INTO `sku` VALUES ('20181130110322696695864763358', 1, '2:3,4:4,5:5,6:4', 3000.00, 200, 'yellow ');
INSERT INTO `sku` VALUES ('20181130111059697152162158578', 1, '2:3,4:4,5:5,6:4', 3000.00, 200, 'yellow ');
INSERT INTO `sku` VALUES ('20181130111059697152162205829', 1, '2:3,4:4,5:5,6:4', 3000.00, 200, 'yellow ');
INSERT INTO `sku` VALUES ('20181130111059697152162220639', 1, '2:3,4:4,5:5,6:4', 3000.00, 200, 'yellow ');
INSERT INTO `sku` VALUES ('20181130111059697152202222896', 1, '2:3,4:4,5:5,6:4', 3000.00, 200, 'yellow ');
INSERT INTO `sku` VALUES ('20181130111403697336527841914', 1, '2:3,4:4,5:5,6:4', 3000.00, 200, 'yellow ');
INSERT INTO `sku` VALUES ('20181130111403697336527887755', 1, '2:3,4:4,5:5,6:4', 3000.00, 200, 'yellow ');
INSERT INTO `sku` VALUES ('20181130111403697336527903270', 1, '2:3,4:4,5:5,6:4', 3000.00, 200, 'yellow ');
INSERT INTO `sku` VALUES ('20181130111403697336567892832', 1, '2:3,4:4,5:5,6:4', 3000.00, 200, 'yellow ');
INSERT INTO `sku` VALUES ('20181130111643697496954761384', 1, '2:3,4:4,5:5,6:4', 3000.00, 200, 'yellow ');
INSERT INTO `sku` VALUES ('20181130111643697496954826265', 1, '2:3,4:4,5:5,6:4', 3000.00, 200, 'yellow ');
INSERT INTO `sku` VALUES ('20181130111643697496954842133', 1, '2:3,4:4,5:5,6:4', 3000.00, 200, 'yellow ');
INSERT INTO `sku` VALUES ('20181130111644697497019221492', 1, '2:3,4:4,5:5,6:4', 3000.00, 200, 'yellow ');
INSERT INTO `sku` VALUES ('20181130132615705268570255365', 1, '2:3,4:4,5:5,6:4', 3000.00, 200, 'yellow ');
INSERT INTO `sku` VALUES ('20181130132615705268570327651', 1, '2:3,4:4,5:5,6:4', 3000.00, 200, 'yellow ');
INSERT INTO `sku` VALUES ('20181130132615705268570356918', 1, '2:3,4:4,5:5,6:4', 3000.00, 200, 'yellow ');
INSERT INTO `sku` VALUES ('20181130132615705268629643786', 1, '2:3,4:4,5:5,6:4', 3000.00, 200, 'yellow ');
INSERT INTO `sku` VALUES ('20181130135540707033113210787', 1, '2:3,4:4,5:5,6:4', 3000.00, 200, 'yellow ');
INSERT INTO `sku` VALUES ('20181130135540707033113253453', 1, '2:3,4:4,5:5,6:4', 3000.00, 200, 'yellow ');
INSERT INTO `sku` VALUES ('20181130135540707033113267911', 1, '2:3,4:4,5:5,6:4', 3000.00, 200, 'yellow ');
INSERT INTO `sku` VALUES ('20181130135540707033172850977', 1, '2:3,4:4,5:5,6:4', 3000.00, 200, 'yellow ');
INSERT INTO `sku` VALUES ('20181130140147707400567743675', 1, '2:3,4:4,5:5,6:4', 3000.00, 200, 'yellow ');
INSERT INTO `sku` VALUES ('20181130140147707400567803620', 1, '2:3,4:4,5:5,6:4', 3000.00, 200, 'yellow ');
INSERT INTO `sku` VALUES ('20181130140147707400567831477', 1, '2:3,4:4,5:5,6:4', 3000.00, 200, 'yellow ');
INSERT INTO `sku` VALUES ('20181130140147707400723518833', 1, '2:3,4:4,5:5,6:4', 3000.00, 200, 'yellow ');

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
) ENGINE = InnoDB AUTO_INCREMENT = 42 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of sku_attr
-- ----------------------------
INSERT INTO `sku_attr` VALUES (1, 1, 1, '1');
INSERT INTO `sku_attr` VALUES (2, 1, 1, '1');
INSERT INTO `sku_attr` VALUES (3, 2, 3, '20181121102127673-0001');
INSERT INTO `sku_attr` VALUES (4, 2, 3, '20181121102127673-0001');
INSERT INTO `sku_attr` VALUES (5, 2, 3, '20181121102127673-0001');
INSERT INTO `sku_attr` VALUES (6, 2, 3, '20181121102322396-0001');
INSERT INTO `sku_attr` VALUES (8, 2, 3, '20181121102322396-0001');
INSERT INTO `sku_attr` VALUES (9, 2, 3, '20181121102504171-0001');
INSERT INTO `sku_attr` VALUES (10, 2, 3, '20181121102504171-0001');
INSERT INTO `sku_attr` VALUES (11, 2, 3, '20181121102504171-0001');
INSERT INTO `sku_attr` VALUES (12, 1, 2, '20181128114619526468082498571');
INSERT INTO `sku_attr` VALUES (13, 1, 2, '20181128114619526468087387250');
INSERT INTO `sku_attr` VALUES (14, 1, 2, '20181128114735526544199659724');
INSERT INTO `sku_attr` VALUES (15, 1, 2, '20181128114735526544211661036');
INSERT INTO `sku_attr` VALUES (16, 1, 2, '20181128131108531557730319400');
INSERT INTO `sku_attr` VALUES (17, 1, 2, '20181128131108531557736980683');
INSERT INTO `sku_attr` VALUES (18, 2, 3, '20181130095345692518631663928');
INSERT INTO `sku_attr` VALUES (19, 2, 3, '20181130095345692518631663928');
INSERT INTO `sku_attr` VALUES (20, 2, 3, '20181130095345692518631663928');
INSERT INTO `sku_attr` VALUES (21, 2, 3, '20181130110322696695709422272');
INSERT INTO `sku_attr` VALUES (22, 2, 3, '20181130110322696695709422272');
INSERT INTO `sku_attr` VALUES (23, 2, 3, '20181130110322696695709422272');
INSERT INTO `sku_attr` VALUES (24, 2, 3, '20181130111059697152094409261');
INSERT INTO `sku_attr` VALUES (25, 2, 3, '20181130111059697152094409261');
INSERT INTO `sku_attr` VALUES (26, 2, 3, '20181130111059697152094409261');
INSERT INTO `sku_attr` VALUES (27, 2, 3, '20181130111403697336281248192');
INSERT INTO `sku_attr` VALUES (28, 2, 3, '20181130111403697336281248192');
INSERT INTO `sku_attr` VALUES (29, 2, 3, '20181130111403697336281248192');
INSERT INTO `sku_attr` VALUES (30, 2, 3, '20181130111643697496880703047');
INSERT INTO `sku_attr` VALUES (31, 2, 3, '20181130111643697496880703047');
INSERT INTO `sku_attr` VALUES (32, 2, 3, '20181130111643697496880703047');
INSERT INTO `sku_attr` VALUES (33, 2, 3, '20181130132615705268487267008');
INSERT INTO `sku_attr` VALUES (34, 2, 3, '20181130132615705268487267008');
INSERT INTO `sku_attr` VALUES (35, 2, 3, '20181130132615705268487267008');
INSERT INTO `sku_attr` VALUES (36, 2, 3, '20181130135540707033022543142');
INSERT INTO `sku_attr` VALUES (37, 2, 3, '20181130135540707033022543142');
INSERT INTO `sku_attr` VALUES (38, 2, 3, '20181130135540707033022543142');
INSERT INTO `sku_attr` VALUES (39, 2, 3, '20181130140147707400490058675');
INSERT INTO `sku_attr` VALUES (40, 2, 3, '20181130140147707400490058675');
INSERT INTO `sku_attr` VALUES (41, 2, 3, '20181130140147707400490058675');

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
) ENGINE = InnoDB AUTO_INCREMENT = 4 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of store
-- ----------------------------
INSERT INTO `store` VALUES (1, 'small store', 1, 1);
INSERT INTO `store` VALUES (2, 'small store', 2, 1);
INSERT INTO `store` VALUES (3, 'buyixiaodian-_-', 1, 1);

-- ----------------------------
-- Table structure for trademark
-- ----------------------------
DROP TABLE IF EXISTS `trademark`;
CREATE TABLE `trademark`  (
  `id` int(11) UNSIGNED NOT NULL AUTO_INCREMENT COMMENT '品牌id',
  `name` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '品牌名称',
  `logo_url` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '品牌logo地址',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 29 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of trademark
-- ----------------------------
INSERT INTO `trademark` VALUES (24, '小米', '699647150679492小米.jpg');
INSERT INTO `trademark` VALUES (27, 'Vivo', '700144273106976Vivo.jpg');
INSERT INTO `trademark` VALUES (28, 'Oppo', '700177799324033Oppo.gif');

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
) ENGINE = InnoDB AUTO_INCREMENT = 16 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES (1, 'admin', '123', 'admin');
INSERT INTO `user` VALUES (2, 'buyi', '123', '19983181508');
INSERT INTO `user` VALUES (3, 'buyi', '123', '13158503013');
INSERT INTO `user` VALUES (4, 'buyi', 'sergs', '14q23434');
INSERT INTO `user` VALUES (5, 'buyi', 'sergs', '14q23434');
INSERT INTO `user` VALUES (6, 'buyi', '123', '19983181208');
INSERT INTO `user` VALUES (7, 'buyi', '123', '19983181228');
INSERT INTO `user` VALUES (8, 'buyi', 'sergs', '14q23434');
INSERT INTO `user` VALUES (9, 'buyi', 'sergs', '14q23434');
INSERT INTO `user` VALUES (10, 'buyi', 'sergs', '14q23434');
INSERT INTO `user` VALUES (11, 'buyi', 'sergs', '14q23434');
INSERT INTO `user` VALUES (12, 'buyi', 'sergs', '14q23434');
INSERT INTO `user` VALUES (13, 'buyi', 'sergs', '14q23434');
INSERT INTO `user` VALUES (14, 'buyi', 'sergs', '14q23434');
INSERT INTO `user` VALUES (15, 'buyi', 'sergs', '14q23434');

SET FOREIGN_KEY_CHECKS = 1;
