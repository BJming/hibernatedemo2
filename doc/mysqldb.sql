/*
Navicat MySQL Data Transfer

Source Server         : local
Source Server Version : 50715
Source Host           : 127.0.0.1:3306
Source Database       : mysqldb

Target Server Type    : MYSQL
Target Server Version : 50715
File Encoding         : 65001

Date: 2017-03-12 22:06:18
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `user`
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` bigint(8) NOT NULL AUTO_INCREMENT COMMENT '登陆ID',
  `name` varchar(255) NOT NULL COMMENT '用户姓名',
  `password` varchar(255) NOT NULL,
  `type` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8 COMMENT='用户表';

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('1', 'bjm2', '123456', 'admin');
INSERT INTO `user` VALUES ('2', 'bjm2', '123456', 'admin');
INSERT INTO `user` VALUES ('3', 'bjm2', '123456', 'admin');
