/*
Navicat MySQL Data Transfer

Source Server         : wj
Source Server Version : 50721
Source Host           : localhost:3306
Source Database       : springboot_datasource2

Target Server Type    : MYSQL
Target Server Version : 50721
File Encoding         : 65001

Date: 2018-06-14 17:46:10
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for good
-- ----------------------------
DROP TABLE IF EXISTS `good`;
CREATE TABLE `good` (
  `g_id` int(11) NOT NULL AUTO_INCREMENT,
  `g_name` varchar(255) DEFAULT NULL,
  `g_num` int(11) DEFAULT NULL,
  `g_describe` varchar(255) DEFAULT NULL,
  `g_is_valid` tinyint(4) DEFAULT '1',
  PRIMARY KEY (`g_id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of good
-- ----------------------------
INSERT INTO `good` VALUES ('1', '农夫山泉', '121', '矿泉水', '1');
INSERT INTO `good` VALUES ('2', '冰红茶', '129', '康师傅', '1');
