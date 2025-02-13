CREATE TABLE `tc_agent_query` (
                                      `id` int(8) NOT NULL AUTO_INCREMENT,
                                      `app` varchar(32) comment '小程序名称',
                                      `type` varchar(32) comment '小程序功能',
                                      `query` varchar(1024) comment '提问语',
                                      `result_app` varchar(32) comment '识别结果：小程序名称',
                                      `result_type` varchar(32) comment '识别结果：小程序功能',
                                      `result` int comment '识别结果',
                                      `is_delete` tinyint(4) DEFAULT '0',
                                      PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

insert into tc_agent_query (app, function, query) values ('瑞幸', '首页', '我想看看瑞幸的首页有哪些推荐');


alter table tc_agent_query add column result_app varchar(32) comment '识别结果：小程序名称' after query;
alter table tc_agent_query add column result_type varchar(32) comment '识别结果：小程序名称' after result_app;