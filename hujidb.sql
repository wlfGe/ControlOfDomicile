/*
Navicat MySQL Data Transfer

Source Server         : sss
Source Server Version : 50513
Source Host           : localhost:3306
Source Database       : hujidb

Target Server Type    : MYSQL
Target Server Version : 50513
File Encoding         : 65001

Date: 2020-10-22 22:16:24
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `cf_huji`
-- ----------------------------
DROP TABLE IF EXISTS `cf_huji`;
CREATE TABLE `cf_huji` (
  `order_num` int(10) NOT NULL,
  `huji_id` varchar(64) NOT NULL,
  `holder_name` varchar(50) DEFAULT NULL,
  `holder_phone` varchar(50) DEFAULT NULL,
  `village_name` varchar(50) DEFAULT NULL,
  `unit_num` varchar(50) DEFAULT NULL,
  `room_num` varchar(50) DEFAULT NULL,
  `holder_native` varchar(50) DEFAULT NULL,
  `holder_status` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`huji_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of cf_huji
-- ----------------------------
INSERT INTO `cf_huji` VALUES ('5', '26f902f235f740ebb783b84eb0b3e7b5', '大家好', '123', '现象', '1', '2', '北京', '异常');
INSERT INTO `cf_huji` VALUES ('1', '84ac47a0446a41d288e0de1269c7769a', '5435', '535', '424', '4324', '425', '213', 'fsf');
INSERT INTO `cf_huji` VALUES ('3', '90b77c803354433bab44b38786eb63d0', '', '2142424', '', '123', '', '123宿舍', '看到');
INSERT INTO `cf_huji` VALUES ('6', '9405b66d6f8b4126932ff0491969e5e8', '王龙飞', '18334992848', '玉林小区', '2', '302', '山西朔州', '正常');
INSERT INTO `cf_huji` VALUES ('4', 'b2ee479d3e1942a8a53d80fbfe4534cc', '哈哈哈哈哈', 'sas', '543', '23', '', '山西', '');
INSERT INTO `cf_huji` VALUES ('2', 'f60c7c5d3cc641a5aff5b2836e87131d', '乔澳', '1213213', '321', '', '', '', '');

-- ----------------------------
-- Table structure for `cf_user`
-- ----------------------------
DROP TABLE IF EXISTS `cf_user`;
CREATE TABLE `cf_user` (
  `user_id` varchar(64) NOT NULL DEFAULT '',
  `user_name` varchar(50) NOT NULL,
  `user_pass` varchar(50) NOT NULL,
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of cf_user
-- ----------------------------
INSERT INTO `cf_user` VALUES ('1', '1', '1');
INSERT INTO `cf_user` VALUES ('2', '1', '1');
INSERT INTO `cf_user` VALUES ('3', '432', '42432');
INSERT INTO `cf_user` VALUES ('32', '45', '545');
INSERT INTO `cf_user` VALUES ('352', '45', '545');
INSERT INTO `cf_user` VALUES ('4', '23', '23');
INSERT INTO `cf_user` VALUES ('4324355', '535', '5355');
INSERT INTO `cf_user` VALUES ('4325', '535', '5355');
INSERT INTO `cf_user` VALUES ('4352', '45', '545');
