/*
Navicat MySQL Data Transfer

Source Server         : .4
Source Server Version : 50642
Source Host           : 192.168.1.4:3306
Source Database       : hx

Target Server Type    : MYSQL
Target Server Version : 50642
File Encoding         : 65001

Date: 2019-10-09 16:44:57
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for patient_medical_check
-- ----------------------------
DROP TABLE IF EXISTS `patient_medical_check`;
CREATE TABLE `patient_medical_check` (
  `CODE` varchar(40) NOT NULL COMMENT 'CODE',
  `MEDICAL_CODE` varchar(40) DEFAULT NULL COMMENT '病历CODE：FK',
  `CHECK_ORAL_REMARK` varchar(500) DEFAULT NULL COMMENT '口腔检查：口腔检查',
  `CHECK_AUXILIARY_REMARK` varchar(500) DEFAULT NULL COMMENT '口腔检查：辅助检查',
  `CREATE_DATE` datetime DEFAULT NULL COMMENT '创建时间',
  `CREATE_ID` varchar(40) DEFAULT NULL COMMENT '创建人',
  `CREATE_NAME` varchar(100) DEFAULT NULL COMMENT '创建人',
  `REMARK` varchar(500) DEFAULT NULL COMMENT '备注',
  `REMARK2` varchar(500) DEFAULT NULL COMMENT '备注',
  `REMARK3` varchar(500) DEFAULT NULL COMMENT '备注',
  `REMARK4` varchar(500) DEFAULT NULL COMMENT '备注',
  `UPDATE_ID` varchar(40) DEFAULT NULL COMMENT '更新人',
  `UPDATE_NAME` varchar(100) DEFAULT NULL COMMENT '更新人',
  `UPDATE_DATE` datetime DEFAULT NULL COMMENT '更新时间',
  `DENTAL_POSITION` varchar(100) DEFAULT NULL COMMENT '口腔检查：牙位',
  `DENTAL_SURFACE` varchar(100) DEFAULT NULL COMMENT '口腔检查：牙面',
  PRIMARY KEY (`CODE`),
  KEY `MEDICAL_CODE` (`MEDICAL_CODE`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='患者病历-口腔检查中间表';
