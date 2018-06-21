/*
Navicat MySQL Data Transfer

Source Server         : wj
Source Server Version : 50721
Source Host           : localhost:3306
Source Database       : springboot_datasource1

Target Server Type    : MYSQL
Target Server Version : 50721
File Encoding         : 65001

Date: 2018-06-14 17:46:03
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `u_id` int(11) NOT NULL AUTO_INCREMENT,
  `u_name` varchar(255) DEFAULT NULL,
  `u_pwd` varchar(255) DEFAULT NULL,
  `u_phone` varchar(255) DEFAULT NULL,
  `u_is_valid` tinyint(4) DEFAULT '1',
  PRIMARY KEY (`u_id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('1', 'xgy', '123', '13612351236', '1');
INSERT INTO `user` VALUES ('2', 'xgy', '123', '13612351236', '1');
INSERT INTO `user` VALUES ('3', 'xgy', '123', '13612351236', '1');
