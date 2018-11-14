CREATE TABLE `category` (
`id` int(11) UNSIGNED NOT NULL AUTO_INCREMENT COMMENT '商品类别id',
`name` varchar(32) CHARACTER SET utf8 NOT NULL COMMENT '商品类别名称',
`parent_id` int(11) UNSIGNED NOT NULL COMMENT '父类别id ，id=0时表示根节点，一级类别',
`delete_status` int(11) UNSIGNED NOT NULL DEFAULT 1 COMMENT '类别状态 1-正常，2-废除',
PRIMARY KEY (`id`) 
);
CREATE TABLE `goods` (
`id` int(11) UNSIGNED NOT NULL AUTO_INCREMENT COMMENT '商品id',
`category_id` int(11) UNSIGNED NOT NULL COMMENT '类别id',
`name` varchar(60) CHARACTER SET utf8 NOT NULL COMMENT '商品名称',
`store_id` int(11) UNSIGNED NOT NULL COMMENT '店铺id',
`trademark_id` int(11) UNSIGNED NULL COMMENT '品牌id',
PRIMARY KEY (`id`) 
);
CREATE TABLE `attr` (
`id` int(11) UNSIGNED NOT NULL AUTO_INCREMENT COMMENT '属性id',
`name` varchar(255) CHARACTER SET utf8 NOT NULL COMMENT '属性名称',
`category_id` int(11) UNSIGNED NOT NULL COMMENT '分类id',
`is_sku` int(11) UNSIGNED NOT NULL DEFAULT 2 COMMENT '是否为sku属性 1-是，2-否',
PRIMARY KEY (`id`) 
);
CREATE TABLE `attr_value` (
`id` int(11) UNSIGNED NOT NULL AUTO_INCREMENT COMMENT '属性值id',
`attr_id` int(11) UNSIGNED NULL COMMENT '属性id',
`name` varchar(64) NULL COMMENT '属性值名称',
`goods_id` int(11) UNSIGNED NULL COMMENT '商品id',
PRIMARY KEY (`id`) 
);
CREATE TABLE `sku` (
`id` int(11) UNSIGNED NOT NULL AUTO_INCREMENT COMMENT 'SKU id',
`goods_id` int(11) UNSIGNED NOT NULL COMMENT '商品id',
`sku_attr` varchar(255) CHARACTER SET utf8 NOT NULL COMMENT 'sku属性键值对  attr_id : value_id;   attr_id : avlue_id',
`price` decimal(20,2) UNSIGNED NOT NULL COMMENT 'SKU 价格',
`count` int(11) UNSIGNED NOT NULL COMMENT '库存',
PRIMARY KEY (`id`) 
);
CREATE TABLE `trademark` (
`id` int(11) UNSIGNED NOT NULL AUTO_INCREMENT COMMENT '品牌id',
`name` varchar(30) CHARACTER SET utf8 NOT NULL COMMENT '品牌名称',
`logo_url` varchar(255) CHARACTER SET utf8 NOT NULL COMMENT '品牌logo地址',
PRIMARY KEY (`id`) 
);
CREATE TABLE `user` (
`id` int(11) UNSIGNED NOT NULL AUTO_INCREMENT COMMENT '用户id',
`name` varchar(255) CHARACTER SET utf8 NOT NULL COMMENT '用户名称',
`password` varchar(255) NOT NULL COMMENT '用户密码',
`telephone` varchar(18) CHARACTER SET utf8 NOT NULL COMMENT '用户电话号码',
PRIMARY KEY (`id`) 
);
CREATE TABLE `store` (
`id` int(11) UNSIGNED NOT NULL AUTO_INCREMENT COMMENT '店铺id',
`name` varchar(255) CHARACTER SET utf8 NOT NULL COMMENT '店铺名称',
`user_id` int(11) UNSIGNED NOT NULL COMMENT '用户id',
`status` int(11) UNSIGNED NOT NULL COMMENT '店铺状态 1-正常 2-关闭',
PRIMARY KEY (`id`) 
);
CREATE TABLE `sku_attr` (
`id` int(11) UNSIGNED NOT NULL AUTO_INCREMENT,
`attr_id` int(11) UNSIGNED NOT NULL COMMENT '属性id',
`attr_value_id` int(11) UNSIGNED NOT NULL COMMENT '属性值id',
`sku_id` int(11) UNSIGNED NOT NULL COMMENT 'sku id',
PRIMARY KEY (`id`) 
);
CREATE TABLE `order` (
`id` int(11) UNSIGNED NOT NULL AUTO_INCREMENT,
`user_id` int(11) UNSIGNED NOT NULL COMMENT '买家id',
`store_id` int(11) UNSIGNED NOT NULL COMMENT '商店id',
`name` varchar(60) NOT NULL COMMENT '订单简要说明',
`sum` decimal(20,2) UNSIGNED NOT NULL COMMENT '订单总金额',
`status` int(11) UNSIGNED NOT NULL DEFAULT 1 COMMENT '订单状态 ',
`address` varchar(120) NOT NULL COMMENT '订单详细地址 json格式',
`express_num` varchar(24) NULL COMMENT '快递单号',
`pay_method` int(11) UNSIGNED NULL COMMENT '付款方式id',
`create_time` datetime NOT NULL COMMENT '创建时间',
`delete_time` datetime NULL COMMENT '删除时间',
PRIMARY KEY (`id`) 
);
CREATE TABLE `order_sku` (
`id` int(11) UNSIGNED NOT NULL AUTO_INCREMENT COMMENT '购买商品备份id',
`order_id` int(11) UNSIGNED NOT NULL COMMENT '订单id',
`goods_id` int(11) UNSIGNED NOT NULL COMMENT '购买商品id',
`goods_name` varchar(60) NOT NULL COMMENT '购买商品名称',
`sku_count` int(11) UNSIGNED NOT NULL COMMENT '购买商品数量',
`sku_price` decimal(20,2) UNSIGNED NOT NULL COMMENT '购买商品单价',
`sku_sum` decimal(20,2) NOT NULL COMMENT '购买商品总金额',
`sku_detail` varchar(255) NOT NULL COMMENT '购买商品sku详细信息',
`after_sale` int(11) UNSIGNED NOT NULL DEFAULT 1 COMMENT '售后状态 1-正常 2-售后申请中 3-退款成功',
PRIMARY KEY (`id`) 
);
CREATE TABLE `address` (
`id` int(11) UNSIGNED NOT NULL AUTO_INCREMENT COMMENT '地址id',
`user_id` int(11) UNSIGNED NOT NULL COMMENT '用户id',
`address` varchar(255) NOT NULL COMMENT '街道地址',
`name` varchar(18) NOT NULL COMMENT '收件人姓名',
`telephone` varchar(11) NOT NULL COMMENT '收件人电话号码',
`postcode` varchar(6) NOT NULL COMMENT '邮政编码',
`create_time` datetime NOT NULL COMMENT '创建时间',
`delete_time` datetime NULL COMMENT '删除时间',
PRIMARY KEY (`id`) 
);
CREATE TABLE `after_sale` (
`id` int(11) UNSIGNED NOT NULL AUTO_INCREMENT COMMENT '售后申请id',
`order_sku_id` int(11) UNSIGNED NOT NULL COMMENT '退货sku的id',
`user_id` int(11) UNSIGNED NOT NULL COMMENT '所属卖家id',
`cause` varchar(255) NOT NULL COMMENT '售后原因',
`result` varchar(255) NULL COMMENT '售后申请结果',
`method` int(11) UNSIGNED NOT NULL COMMENT '售后方式 1-仅退款 2-退货退款',
`status` int(11) UNSIGNED NOT NULL COMMENT '售后状态 1-申请售后 2-寄回货物（如有） 3-卖家收货并退款',
`express_detail` varchar(255) NULL COMMENT '退货快递信息 json格式',
`create_time` datetime NOT NULL COMMENT '创建时间',
`delete_time` datetime NULL COMMENT '删除时间',
PRIMARY KEY (`id`) 
);
