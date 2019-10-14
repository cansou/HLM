/*==============================================================*/
/* DBMS name:      MySQL 5.0                                    */
/* Created on:     2019/3/21 ������ 19:17:33                       */
/*==============================================================*/


drop table if exists hx.guid_schedule;

drop table if exists hx.guid_schedule_log;

drop table if exists hx.hx_clue;

drop table if exists hx.hx_clue_order;

drop table if exists hx.hx_patient;

drop table if exists hx.patient_medical;

drop table if exists hx.patient_service;

drop table if exists hx.patient_service_advisory;

drop table if exists hx.patient_service_choose;

drop table if exists hx.server_detail;

drop table if exists hx.server_info;

drop table if exists hx.shop_config;

drop table if exists hx.shop_order;

drop table if exists hx.shop_schedule;

drop table if exists hx.shop_server;

drop table if exists hx.shop_server_detail;

/*==============================================================*/
/* Table: guid_schedule                                         */
/*==============================================================*/
create table hx.guid_schedule
(
   CODE                 varchar(40) not null comment 'CODE',
   MEMBER_NO_GUID       varchar(40) comment 'Ա�����',
   MEMBER_NAME_GUID     varchar(100) comment 'Ա������',
   SHOP_NO              varchar(40) comment '������',
   SHOP_NAME            varchar(100) comment '��������',
   MERCHANT_NO          varchar(40) comment '�̻����',
   MERCHANT_NAME        varchar(100) comment '�̻�����',
   TYPE                 varchar(6) comment '����(����WEEK���̶�FIXED)',
   DAY_NUM              int comment '���ڼ�(1������һ����������7��������)',
   SCHEDULE_CODE        varchar(40) comment '���code',
   CREATE_ID            varchar(40) comment '������',
   CREATE_DATE          datetime comment '����ʱ��',
   primary key (CODE)
);

alter table hx.guid_schedule comment 'Ա����';

/*==============================================================*/
/* Table: guid_schedule_log                                     */
/*==============================================================*/
create table hx.guid_schedule_log
(
   CODE                 varchar(60) not null comment 'CODE',
   MEMBER_NO_GUID       varchar(40) comment 'Ա�����',
   MEMBER_NAME_GUID     varchar(100) comment 'Ա������',
   SHOP_NO              varchar(40) comment '������',
   SHOP_NAME            varchar(100) comment '��������',
   MERCHANT_NO          varchar(40) comment '�̻����',
   MERCHANT_NAME        varchar(100) comment '�̻�����',
   WORK_DATE            datetime comment '����',
   DAY_NUM              int comment '���ڼ�(1������һ����������7��������)',
   SCHEDULE_CODE        varchar(40) comment '���code',
   SCHEDULE_NAME        varchar(64) comment '�����',
   WORK_TIME            time comment '�ϰ�ʱ��',
   OFF_TIME             time comment '�°�ʱ��',
   APT_FLAG             varchar(6) comment '�Ƿ��Լ��appointment��N�� Y��)',
   CREATE_ID            varchar(40) comment '������',
   CREATE_DATE          datetime comment '����ʱ��',
   primary key (CODE)
);

alter table hx.guid_schedule_log comment 'Ա����ʷ�Ű�';

/*==============================================================*/
/* Table: hx_clue                                               */
/*==============================================================*/
create table hx.hx_clue
(
   CODE                 varchar(40) not null comment '������',
   NAME                 varchar(20) comment '�ͻ�����',
   PHONE                varchar(11) comment '�绰����',
   SEX                  varchar(10) comment '�Ա�',
   AGE                  int comment '����',
   PROVINCE             varchar(40) comment 'ʡ����',
   CITY                 varchar(40) comment '������',
   AREA                 varchar(100) comment '������',
   ADDR_INFO            varchar(255) comment '������ַ��ʡ������ϸ��ַȫ��������',
   SOURCE               varchar(20) comment '��Դ',
   WECHAT_NO            varchar(40) comment '΢�ź�',
   WECHAT_NAME          varchar(40) comment '΢���ǳ�',
   USER_TYPE            varchar(40) comment '�ͻ�����',
   USER_PRICE           bigint comment '�ͻ�����',
   STATUS               varchar(10) comment '״̬(FREEZE�����У�CANG������HASG�ѱ�����)',
   VALID_STATUS         varchar(8) comment '�Ƿ���Ч(VALID:��Ч��INVALID����Ч)',
   CREATE_TIME          datetime comment '�������',
   ORDER_NO             varchar(40) comment '������',
   PROJECT              varchar(20) comment 'ԤԼ��Ŀ',
   RESERVE_DATE         date comment 'ԤԼ����',
   RESERVE_TIME         varchar(20) comment 'ԤԼʱ��',
   FOLLOW_NAME          varchar(10) comment '������Ա',
   WISH_LEVEL           varchar(1) comment '��Ը�ȼ�',
   COMPLAINT            varchar(200) comment '����',
   REMARK               varchar(200) comment '��ע',
   primary key (CODE)
);

alter table hx.hx_clue comment '������(hx_clue)';

/*==============================================================*/
/* Table: hx_clue_order                                         */
/*==============================================================*/
create table hx.hx_clue_order
(
   CODE                 varchar(40) not null comment '����������',
   CLUE_CODE            varchar(40) comment '������(fk:CLUE_CODE)',
   MEMBER_NO            varchar(40) comment '�������',
   MEMBER_NAME          varchar(100) comment '��������',
   SHOP_NO              varchar(40) comment '�ֵ���',
   SHOP_NAME            varchar(100) comment '�ֵ�����',
   MERCHANT_NO          varchar(40) comment '�̻����',
   MERCHANT_NAME        varchar(100) comment '�̻�����',
   SHOP_SERVER_CODE     varchar(40) comment '�������code(fk:shop_server.code)',
   SERVER_NAME          varchar(100) comment '��������',
   SERVER_CODE          varchar(40) comment '����code��fk:server_icode��',
   USER_TYPE            varchar(40) comment '�ͻ�����',
   USER_PRICE           bigint comment '�ͻ�����',
   STATUS               varchar(6) comment '״̬��FREEZE�����У�OK��ʹ�ã�CANCEL��ȡ����',
   CREATE_ID            varchar(40) comment '������',
   CREATE_DATE          datetime comment '��������',
   UPDATE_ID            varchar(40) comment '������',
   UPDATE_DATE          datetime comment '��������',
   REMARK               varchar(200) comment '��ע',
   TYPE                 varchar(10),
   primary key (CODE)
);

alter table hx.hx_clue_order comment '����������(hx_clue_order)';

/*==============================================================*/
/* Table: hx_patient                                            */
/*==============================================================*/
create table hx.hx_patient
(
   CODE                 varchar(40) not null comment '����code',
   SHOP_NO              varchar(40) comment '�ֵ���',
   SHOP_NAME            varchar(100) comment '�ֵ�����',
   MERCHANT_NO          varchar(40) comment '�̻����',
   MERCHANT_NAME        varchar(100) comment '�̻�����',
   NAME                 varchar(20) comment '����',
   SEX                  varchar(10) comment '�Ա�',
   TYPE                 varchar(6) comment '��������(PT��ͨLS��ʱ)',
   CASE_NO              varchar(40) comment '������',
   BIRTH_DATE           date comment '����������',
   AGE                  int comment '����',
   NATIONALITY          varchar(20) comment '����',
   IDNO                 varchar(20) comment '���֤',
   PHONE                varchar(20) comment '�ֻ���',
   PHONE_REMARK         varchar(20) comment '�ֻ��ű�ע',
   PHONE_NO             varchar(20) comment '�绰��',
   PHONE_NO_REMARK      varchar(20) comment '�绰�ű�ע',
   WECHAT               varchar(40) comment '΢��',
   QQ_NO                varchar(20) comment 'QQ��',
   MAIL                 varchar(40) comment '����',
   PROVINCE_CODE        varchar(40) comment 'ʡcode',
   PROVINCE             varchar(100) comment 'ʡ',
   CITY_CODE            varchar(40) comment '��code',
   CITY                 varchar(100) comment '��',
   AREA_CODE            varchar(40) comment '��code',
   AREA                 varchar(100) comment '��',
   ADDR_DETAIL          varchar(100) comment '��ϸ��ַ',
   ADDR_INFO            varchar(255) comment '������ַ��ʡ������ϸ��ַȫ��������',
   SOURCE1_CODE         varchar(40) comment '��Դ1code',
   SOURCE1              varchar(64) comment '��Դ1',
   SOURCE2_CODE         varchar(40) comment '��Դ2code',
   SOURCE2              varchar(64) comment '��Դ2',
   SOURCE3_CODE         varchar(40) comment '��Դ3code',
   SOURCE3              varchar(64) comment '��Դ3',
   REMARK               varchar(400) comment '���߱�ע',
   PAST_HISTORY         varchar(400) comment '����ʷ',
   ALLERGY_HISTORY      varchar(400) comment '����ʷ',
   MEDICATION_HISTORY   varchar(400) comment '��ҩʷ',
   CREATE_TIME          datetime comment '����ʱ��',
   FIRST_MEMBER_NO      varchar(40) comment '����ҽ��code',
   FIRST_MEMBER_NAME    varchar(100) comment '����ҽ��name',
   DUTY_MEMBER_NO       varchar(40) comment '����ҽ��code',
   DUTY_MEMBER_NAME     varchar(100) comment '����ҽ��name',
   CONS_MEMBER_NO       varchar(40) comment '��ѯʦcode',
   CONS_MEMBER_NAME     varchar(100) comment '��ѯʦname',
   CREATE_ID            varchar(40) comment '������',
   CREATE_DATE          datetime comment '��������',
   UPDATE_ID            varchar(40) comment '������',
   UPDATE_DATE          datetime comment '��������',
   primary key (CODE)
);

alter table hx.hx_patient comment '���߱�(hx_patient)';

/*==============================================================*/
/* Table: patient_medical                                       */
/*==============================================================*/
create table hx.patient_medical
(
   CODE                 varchar(40) not null comment 'CODE',
   PATIENT_RESERVATION_CODE varchar(40) comment '���߷���CODE��FK',
   PATIENT_NO           varchar(40) comment '���߱�ţ�FK',
   PATIENT_NAME         varchar(100) comment '��������',
   DOCTOR_NO            varchar(40) comment 'ҽ����ţ�FK',
   DOCTOR_NAME          varchar(100) comment 'ҽ������',
   ASSISTANT_NO         varchar(40) comment '���ֱ�ţ�FK',
   ASSISTANT_NAME       varchar(100) comment '��������',
   VISITING_DATE        datetime comment '����ʱ��',
   VISITING_TYPE        varchar(20) comment '�������ͣ�  ���NEWDIAGNOSIS�����REVIEW',
   MAIN_REMARK          varchar(500) comment '���߼���ʷ������',
   MAIN_CURRENT_REMARK  varchar(500) comment '���߼���ʷ���ֲ�ʷ',
   MAIN_PAST_REMARK     varchar(500) comment '���߼���ʷ������ʷ',
   CHECK_ORAL_REMARK    varchar(500) comment '��ǻ��飺��ǻ���',
   CHECK_AUXILIARY_REMARK varchar(500) comment '��ǻ��飺�������',
   PLAN_DIAGNOSIS_REMARK varchar(500) comment '��������Ƽƻ������',
   PLAN_TREATMENT_REMARK varchar(500) comment '��������Ƽƻ������Ƽƻ�',
   DM_DISPOSAL_REMARK   varchar(500) comment '������ҽ��������',
   DM_MEDICAL_REMARK    varchar(500) comment '������ҽ����ҽ��',
   OTHER_LABEL_REMARK   varchar(500) comment '��������ǩ',
   OTHER_REMARK         varchar(500) comment '��������ע',
   CREATE_DATE          datetime comment '����ʱ��',
   CREATE_ID            varchar(40) comment '������',
   CREATE_NAME          varchar(100) comment '������',
   REMARK               varchar(500) comment '��ע',
   REMARK2              varchar(500) comment '��ע',
   REMARK3              varchar(500) comment '��ע',
   REMARK4              varchar(500) comment '��ע',
   UPDATE_ID            varchar(40) comment '������',
   UPDATE_NAME          varchar(100) comment '������',
   UPDATE_DATE          datetime comment '����ʱ��',
   primary key (CODE)
);

alter table hx.patient_medical comment '���߲���';

/*==============================================================*/
/* Table: patient_service                                       */
/*==============================================================*/
create table hx.patient_service
(
   CODE                 varchar(40) not null comment 'CODE',
   PATIENT_NO           varchar(40) comment '���߱�ţ�FK-���߼�¼code',
   PATIENT_NAME         varchar(100) comment '��������',
   MOBILE               varchar(15) comment '�ֻ���',
   PATIENT_TYPE         varchar(15) comment '�������ͣ���ͨ��ORDINARY��������UNCONFIRMED',
   MEDICAL_NO           varchar(40) comment '�������',
   ADVISORY_DATE        datetime comment '��ѯʱ��',
   ADVISORY_NO          varchar(40) comment '��ѯʦ��ţ�FK',
   ADVISORY_NAME        varchar(100) comment '��ѯʦ����',
   SHOP_NO              varchar(40) comment '�����ţ�FK',
   SHOP_NAME            varchar(100) comment '��������',
   MERCHANT_NO          varchar(40) comment '�̻���ţ�FK',
   MERCHANT_NAME        varchar(100) comment '�̻�����',
   RESERVATION_DATE     datetime comment 'ԤԼʱ��',
   RESERVATION_DATE_LEN int comment 'ԤԼʱ�������ӣ�����15����',
   RESERVATION_DOCTOR_NO varchar(40) comment 'ԤԼҽ����ţ�FK',
   RESERVATION_DOCTOR_NAME varchar(100) comment 'ԤԼҽ������',
   RESERVATION_TYPE     varchar(15) comment 'ԤԼ���ͣ�ԤԼ��RESERVATION���Һţ�REGISTERED',
   REGISTERED_DATE      datetime comment '�Һ�ʱ��',
   REGISTERED_DOCTOR_NO varchar(10) comment '�Һ�ҽ����ţ�FK',
   REGISTERED_DOCTOR_NAME varchar(100) comment '�Һ�ҽ������',
   ASSISTANT_NO         varchar(40) comment '���ֱ�ţ�FK',
   ASSISTANT_NAME       varchar(100) comment '��������',
   VISTITING_STATUS     varchar(15) comment '����״̬��δȷ�ϣ�UNCONFIRMED�������У�TREATMENT��ȡ����CANCEL��������ɣ�FINISHED',
   VISITING_TYPE        varchar(20) comment '�������ͣ�  ���NEWDIAGNOSIS�����REVIEW',
   VISITING_DATE        datetime comment '����ʱ��',
   TRIAGE_DATE          datetime comment '����ʱ��',
   REVIEW_RESERVATION_DATE datetime comment '����ԤԼʱ��',
   FINISHED_DATE        datetime comment '�������ʱ��',
   MEDICAL_DATE         datetime comment '�༭����ʱ��',
   CREATE_DATE          datetime comment '����ʱ��',
   CREATE_ID            varchar(40) comment '������',
   CREATE_NAME          varchar(100) comment '����������',
   REMARK               varchar(500) comment '��ע',
   REMARK2              varchar(500) comment '��ע',
   REMARK3              varchar(500) comment '��ע',
   REMARK4              varchar(500) comment '��ע',
   UPDATE_ID            varchar(40) comment '������',
   UPDATE_NAME          varchar(100) comment '������',
   UPDATE_DATE          datetime comment '����ʱ��',
   primary key (CODE)
);

alter table hx.patient_service comment '���߷���ԤԼ/�Һ�/���';

/*==============================================================*/
/* Table: patient_service_advisory                              */
/*==============================================================*/
create table hx.patient_service_advisory
(
   CODE                 varchar(40) not null comment 'CODE',
   PATIENT_RESERVATION_CODE varchar(40) comment '���߷���CODE��FK',
   PATIENT_NO           varchar(40) comment '���߱�ţ�FK',
   PATIENT_NAME         varchar(100) comment '��������',
   PROJECT_CODES        varchar(1000) comment '��ĿCODE�ö��ŷָ�',
   PROJECT_NAMES        varchar(2000) comment '��Ŀ�������ƣ�����ö��ŷָ�',
   ADVISORY_CONTENT     varchar(1000) comment '��ѯ����',
   EXPLAIN_REMARK       varchar(500) comment '����˵��',
   WANT                 varchar(500) comment '�ɽ���Ը���ߣ�HIGH���У�CENTRAL���ͣ�LOW',
   CREATE_DATE          datetime comment '����ʱ��',
   CREATE_ID            varchar(40) comment '������',
   REMARK               varchar(500) comment '��ע',
   REMARK2              varchar(500) comment '��ע',
   REMARK3              varchar(500) comment '��ע',
   REMARK4              varchar(500) comment '��ע',
   primary key (CODE)
);

alter table hx.patient_service_advisory comment '���߷�����ѯ';

/*==============================================================*/
/* Table: patient_service_choose                                */
/*==============================================================*/
create table hx.patient_service_choose
(
   CODE                 varchar(40) not null comment 'CODE',
   PATIENT_RESERVATION_CODE varchar(40) comment '���߷���CODE',
   PROJECT_CODE         varchar(40) comment '��ĿCODE',
   PROJECT_NAME         varchar(100) comment '��Ŀ����',
   PROJECT_PROPERTY_CODE varchar(40) comment '������Ŀ����CODE',
   PROJECT_PROPERTY_NAME varchar(100) comment '������Ŀ��������',
   CREATE_DATE          datetime comment '����ʱ��',
   CREATE_ID            varchar(40) comment '������',
   REMARK               varchar(500) comment '��ע',
   REMARK2              varchar(500) comment '��ע',
   REMARK3              varchar(500) comment '��ע',
   REMARK4              varchar(500) comment '��ע',
   primary key (CODE)
);

alter table hx.patient_service_choose comment '���߷���ѡ��';

/*==============================================================*/
/* Table: server_detail                                         */
/*==============================================================*/
create table hx.server_detail
(
   CODE                 varchar(40) not null comment 'CODE',
   SERVER_CODE          varchar(40) comment '����CODE��fk:server_info.code��',
   USER_TYPE            varchar(40) comment '�ͻ�����',
   SERVER_NUM           int comment '����',
   PRICE                bigint comment '���ۣ���Ϊ��λ��',
   IS_SHOP              varchar(10) comment '�Ƿ񵽵� (YES �� NO ��)',
   SERVER_DESC          varchar(200) comment '����',
   CREATE_DATE          datetime comment '����ʱ��',
   primary key (CODE)
);

alter table hx.server_detail comment 'ϵͳ������';

/*==============================================================*/
/* Table: server_info                                           */
/*==============================================================*/
create table hx.server_info
(
   CODE                 varchar(40) not null comment 'CODE',
   MERCHANT_NO          varchar(40) comment '�̻����',
   MERCHANT_NAME        varchar(100) comment '�̻�����',
   SERVER_NAME          varchar(128) comment '��Ʒ����',
   PRICE                bigint comment '�۸񣨷�Ϊ��λ��',
   ORIGINAL_PRICE       bigint comment 'ԭ�ۣ���Ϊ��λ��',
   CTX                  text comment '��Ʒ˵��',
   STATUS               varchar(6) comment '״̬��use ���� unuse ���ã�',
   UPDATE_ID            varchar(40) comment '������',
   UPDATE_DATE          datetime comment '����ʱ��',
   CREATE_ID            varchar(40) comment '������',
   CREATE_DATE          datetime comment '����ʱ��',
   primary key (CODE)
);

alter table hx.server_info comment 'ϵͳ����';

/*==============================================================*/
/* Table: shop_config                                           */
/*==============================================================*/
create table hx.shop_config
(
   CODE                 varchar(40) not null comment 'CODE',
   SHOP_NO              varchar(40) comment '������',
   SHOP_NAME            varchar(100) comment '��������',
   MERCHANT_NO          varchar(40) comment '�̻����',
   MERCHANT_NAME        varchar(100) comment '�̻�����',
   LABLE_NAME           varchar(64) comment '��ǩ��',
   LABLE_NO             varchar(40) comment '��ǩNO',
   PARENT_CODE          varchar(40) comment '��CODE',
   UPDATE_ID            varchar(40) comment '������',
   UPDATE_DATE          datetime comment '����ʱ��',
   CREATE_ID            varchar(40) comment '������',
   CREATE_DATE          datetime comment '����ʱ��',
   INDEX_NO             int comment '����',
   primary key (CODE)
);

alter table hx.shop_config comment '�ŵ�����';

/*==============================================================*/
/* Table: shop_order                                            */
/*==============================================================*/
create table hx.shop_order
(
   CODE                 varchar(40) not null comment 'CODE',
   SHOP_NO              varchar(40) comment '������',
   SHOP_NAME            varchar(100) comment '��������',
   MERCHANT_NO          varchar(40) comment '�̻����',
   MERCHANT_NAME        varchar(100) comment '�̻�����',
   ORDER_NO             varchar(40) comment '�������',
   ORDER_TYPE           varchar(6) comment '�������ͣ�SERVER:����',
   SERVE_CODE           varchar(40) comment '����CODE',
   SERVE_NAME           varchar(128) comment '��������',
   MEMBER_NO_GUID       varchar(40) comment '�µ��˱��',
   MEMBER_NAME_GUID     varchar(100) comment '�µ�������',
   MOBILE               varchar(16) comment '�µ��˵绰',
   SERIAL_NUM           varchar(64) comment '֧����ˮ���',
   PAY_TYPE             varchar(6) comment '���ʽ(WX:΢�ţ�ALI:֧������BANK:����ת��)',
   AMOUNT               bigint comment '�������Ϊ��λ��',
   PAY_TIME             datetime comment '����ʱ��',
   PAY_CERT             varchar(1280) comment '֧��ƾ֤,���Ŷ��ŷָ�',
   STATUS               varchar(6) comment '���״̬(WAIT:����PASS:ͨ����UNPASS���ܾ�)',
   UPDATE_ID            varchar(40) comment '������',
   UPDATE_DATE          datetime comment '����ʱ��',
   CREATE_ID            varchar(40) comment '������',
   CREATE_DATE          datetime comment '����ʱ��',
   REMARK               varchar(200) comment '��ע',
   REMARK2              varchar(200) comment '��ע1',
   REMARK3              varchar(200) comment '��ע2',
   primary key (CODE)
);

alter table hx.shop_order comment '�ŵ궩��';

/*==============================================================*/
/* Table: shop_schedule                                         */
/*==============================================================*/
create table hx.shop_schedule
(
   CODE                 varchar(40) not null comment 'CODE',
   SHOP_NO              varchar(40) comment '������',
   SHOP_NAME            varchar(100) comment '��������',
   MERCHANT_NO          varchar(40) comment '�̻����',
   MERCHANT_NAME        varchar(100) comment '�̻�����',
   SCHEDULE_NAME        varchar(64) comment '�����',
   WORK_TIME            time comment '�ϰ�ʱ��',
   OFF_TIME             time comment '�°�ʱ��',
   APT_FLAG             varchar(6) comment '�Ƿ��Լ��appointment��N�� Y��)',
   DEL_FLAG             varchar(6) comment '�Ƿ�ɾ����Nδɾ�� Yɾ����',
   UPDATE_ID            varchar(40) comment '������',
   UPDATE_DATE          datetime comment '����ʱ��',
   CREATE_ID            varchar(40) comment '������',
   CREATE_DATE          datetime comment '����ʱ��',
   primary key (CODE)
);

alter table hx.shop_schedule comment '�ŵ���';

/*==============================================================*/
/* Table: shop_server                                           */
/*==============================================================*/
create table hx.shop_server
(
   CODE                 varchar(40) not null comment 'CODE',
   SHOP_NO              varchar(40) comment '������',
   SHOP_NAME            varchar(100) comment '��������',
   MERCHANT_NO          varchar(40) comment '�̻����',
   MERCHANT_NAME        varchar(100) comment '�̻�����',
   SERVER_CODE          varchar(40) comment '����code',
   SERVER_NAME          varchar(128) comment '��������',
   PRICE                bigint comment '�۸�',
   ORIGINAL_PRICE       bigint comment 'ԭ�ۣ���Ϊ��λ��',
   ORDER_NO             varchar(40) comment '������',
   UPDATE_ID            varchar(40) comment '������',
   UPDATE_DATE          datetime comment '����ʱ��',
   CREATE_ID            varchar(40) comment '������',
   CREATE_DATE          datetime comment '����ʱ��',
   primary key (CODE)
);

alter table hx.shop_server comment '�������';

/*==============================================================*/
/* Table: shop_server_detail                                    */
/*==============================================================*/
create table hx.shop_server_detail
(
   CODE                 varchar(40) not null comment 'CODE',
   SHOP_SERVER_CODE     varchar(40) comment '�������code(fk:shop_server.code)',
   SERVER_CODE          varchar(40) comment '����code(fk:server_info.code)',
   SERVER_NAME          varchar(128) comment '��������',
   USER_TYPE            varchar(40) comment '�ͻ�����',
   PRICE                bigint comment '���ۣ���Ϊ��λ��',
   SERVER_NUM           int comment '������',
   USE_NUM              int comment '��ʹ������',
   UNUSE_NUM            int comment 'ʣ������',
   FREEZE_NUM           int comment '��������',
   UPDATE_ID            varchar(40) comment '������',
   UPDATE_DATE          datetime comment '����ʱ��',
   CREATE_ID            varchar(40) comment '������',
   CREATE_DATE          datetime comment '����ʱ��',
   IS_SHOP              varchar(10) comment '�Ƿ񵽵� (YES �� NO ��)',
   SERVER_DESC          varchar(200) comment '����',
   primary key (CODE)
);

alter table hx.shop_server_detail comment '���������';



ALTER TABLE `hx`.`shop_config`
ADD INDEX `HX_INDEX_CFG_PCODE` (`PARENT_CODE`) ;

ALTER TABLE `hx`.`patient_service_advisory` 
ADD COLUMN `VISITING_DATE` datetime(0) NULL COMMENT '����ʱ��' AFTER `PATIENT_NAME`;

ALTER TABLE `hx`.`patient_service`
MODIFY COLUMN `REGISTERED_DOCTOR_NO`  varchar(40)   NULL DEFAULT NULL COMMENT '�Һ�ҽ����ţ�FK'  ;



ALTER TABLE `hx`.`patient_service` 
ADD COLUMN `VISTITING_ADVISORY_DATE` DATETIME NULL COMMENT '��ѯʦ����ʱ��' AFTER `VISITING_DATE`;