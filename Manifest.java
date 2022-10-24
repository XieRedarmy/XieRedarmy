public class Manifest{
  在线商城微服务改造
 Spring Cloud Alibaba: CSB Gateway, 服务配置中心Nacos,降级熔断流量控制Sentinel,服务
调用Open Feign,Swagger,进程缓存Caffeine, 分布式缓存Redis,消息Rocketmq,数据库
Mysql,对象存储OSS,持久框架Mybatis, Elasticsearch,EDAS 应用管理,实时监控服务
ARMS,SLS 日志监控服务,分布式任务SchedulerX,分布式数据库中间件DRDS,安全授权验证
Shiro JWT。
 项目职责：
 店铺系统新增进程缓存Caffeine 优化读性能.查找并处理内存泄露问题线程使用问题.
 针对POS 并发日志混乱问题,添加MDC 日志追踪,既方便查找问题,也据此优化耗时的逻辑
 拆分POS 现有功能到微服务,并和微服务对接并保留旧逻辑可随时切换
 微服务改造遵循DDD 领域驱动设计,增加值对象(解耦参数和值校验),优化内部逻辑(单次
改批量异步等),防腐层设计解耦外部依赖和数据库依赖,增加可维护性可扩展性可测试性
 设计并实现旧的POS 项目和新微服务之间的事务一致(通过事务补偿来实现).
 微服务分布式事物设计:通过MQ 进行异常事物补偿反向接口实现最终一致性(如下单扣库
存营销会员,有一个异常则其他服务进行反向接口补偿,支持重新消费3 次,失败告警并入
库进行JOB 处理,在失败则然后人工处理)
 分布式锁通过Redis 来实现.Redis 缓存更新实现:更新数据库前后双删缓存.幂等性也是利
用分布式锁实现.对一些热点key 如送货配置货物体积供应商等使用本地缓存减少访问
redis.
 订单数据同步到elastic search 优化:订单数据发送到MQ 组装成ES Bulk API 调用需要
的模型,有失败发生则发送消息到MQ 然后重试
 分库分表如订单表按照账号ID 分库,订单号分表每个表数据不超过500 万(用户表按照用
户ID)
 订单查询方案优化1.直接查询ES. 2.查询redis 获取用户和订单id 缓存然后去数据库查
询订单详情(缓存在订单创建的时候产生(写ES 和缓存不影响写入DB),并限制ID 的长度如
不超过200,并定期清理ZSET).
 购物车逻辑优化:数据先写入redis,同时写入MQ,线程异步消费MQ 进行DB 更新



Project Manager, Dec 2020 to Now
•	Supports BPM for all technical activities
•	Manages and be responsible for all IT related activities
•	Allocates adequate technical resources
•	Provides recommendations for technical aspects of the requirements, the estimated development effort/estimated hardware and software investment/estimated development cost & timeframe
•	Manages and be responsible for the technical vendor (including outsourcing IT vendor) engagement and performance (i.e. solicit vendor, vendor negotiation, contract negotiation, monitor vendor delivery schedule/quality, vendor operational procedures)
•	Ensures overall system quality assurance
•	Ensures BPM has visibility on high level timeline and readiness for SIT
•	Recommends to the BPM should any hardware upgrade and/or technology change is necessary
•	Monitors the progress of the IT development team/vendor and report to the BPM should there be any de-scoping or slippage of task
Skill set – Waterfall, AGILE, SCRUM, Project Planning and Management, Resources Planning and Management, Cost Management, Risk Management, Vendor Management, Vendor Selection


Project Manager, Jun 2019 to Oct 2020
•	Responsible for the overall direction, coordination, implementation, execution, control, and completion of specified projects ensuring consistency with abc project management governance.
•	Project manages relatively small projects whilst overseeing the total project list and the key critical projects
•	Resolves complex problems or transactions, where expertise is required to interpret against policies, guidelines, or processes.
•	Supervises day-to-day work of junior level employees.
•	Applies in-depth disciplinary knowledge of concepts and procedures within own area to resolve issues.
•	Ensures creation of project plan and charter benefits management plan, stakeholder management plan, acceptance plan, and central project issue log.
•	Ensures resources are assigned to project & monitor commitment.
•	Ensures change control is executed throughout project.
•	Identifies, documents, and understands project dependencies
•	Identifies key stakeholders who participate in project scope definition.
•	Tracks actual project costs, identify variances, and reforecast project costs as needed.
•	Measures project management performance against standards.
•	Ensures appropriate project staffing levels.
•	Establishes project communication needs and create project communication plan.
•	Creates the project risk management plan.
•	Partners with cross function peers to create, administer, track, and eventually close project contracts.
•	Appropriately assess risk when business decisions are made, demonstrating consideration for the firm's reputation and safeguarding abc Group.
•	Manages on-site and off-shore IT teams (DEV, BA, QA) in APAC
Skill set – Waterfall, AGILE, SCRUM, Project Planning, Project Management, Resources Planning, Cost Management, Risk Management, JIRA, Confluence, Clarity

Project Manager, Dec 2017 to May 2019
•	Manages project schedule, business requirement, budget, and resources
•	Acts as Development Manager for development team
•	Works out which IT products to use based on cost benefit analysis and research
•	Advises the client on managing future IT needs
•	Digitalizes business process
•	Manages external vendors and off-shore development team in China
Skill set – AGILE, SCRUM, SDLC, Project Planning, Project Management, Resources Planning, Cost Management, Risk Management
 
Technical Architect / (Project Manager & Scrum Master), Feb 2016 to Dec 2017
•	Identifying the organization’s needs
•	Breaking down projects into manageable chunks
•	Managing off-shore development team
•	Working out which IT products to use based on cost benefit analysis and research
•	Agreeing plans with the client
•	Explaining to designers and developers what's required and overseeing the progress
•	Producing documents that monitor progress and ensure the quality of the project
•	Providing and managing APIs for other systems
•	Manages off-shore development team in Sri Lanka
Skill set – AGILE, SCRUM, JasperReport, Java, Hibernate, Spring, jQuery, AJAX, RESTful, OAuth, Oracle, SQL, Stored Procedure, UI & UX Design, HTML5, CSS, NodeJS, AngularJS, JavaScript, ReactJS, Supply Chain Management

Solution Consultant, May 2015 to Feb 2016
•	Product Manager of RunMyProcess
o	Business Development
o	Internal sales training
o	Providing workflow solutions to different sectors
o	Participating in prospect ‘discovery’ sessions to ascertain the prospect’s requirements and pain-points
o	Answering RFPs
o	Developing and conducting presentations based on the outcome of the discovery sessions and RFP
o	Providing API management and support to clients for integrating their existing systems with RunMyProcess
Skill set – Workflow Management, Business Process Management, Business Development, Project Management, Resources Management
Successful case – Bandai

Solutions Consultant, Oct 2014 to Feb 2015
•	Providing Supply Chain solutions to Softline/Hardline/Footwear industries
•	Participating in prospect ‘discovery’ sessions to ascertain the prospect’s requirements and pain-points
•	Assist with answering RFPs
•	Develop presentations based on the outcome of the discovery sessions and RFP
•	Conduct presentations
•	BI Solutions owner
Skill set – Jaspersoft BI, OLAP, SQL, and Supply Chain Management


Presales Specialist, Jan 2012 to Sept 2014
•	Providing Supply Chain solutions to Softline/Hardline/Footwear industries
•	Participating in prospect ‘discovery’ sessions to ascertain the prospect’s requirements and pain-points
•	Assist with answering RFPs
•	Develop presentations based on the outcome of the discovery sessions and RFP
•	Conduct presentations with C-levels
•	Communicate effectively to the internal development team
•	Support the channels network whenever required
•	Work collaboratively with the Sales & Marketing team to provide meaningful contribution to strategic marketing programs
•	BI Solutions owner
Skill set – Jaspersoft BI, OLAP, SQL, and Supply Chain Management, Business Development, Account Management
Successful cases – New Balance, VFC, Coach, Brown Shoe, Dick’s Sporting Goods

System Analyst, Jul 2010 to Jan 2012
•	Code review
•	Design/analyze the system
•	Performance Tuning
•	Product Manager of JDA and CRM (Microsoft Dynamics CRM) team
o	Product Sales and Presales
o	Defining product strategy
•	Solution Architect of Total Retail Solutions
o	Defining different KPIs for retail between different products
•	Team Leader of I.T. Outsourcing team
o	Doing feasibility reports for clients
o	Assigning jobs, tasks and schedules to different roles
Skill set – Java, J2EE, Flex, ORM, WebLogic, Jira, Java, JDA, Microsoft Dynamics CRM, IBM Cognos BI, Kronos Workforce Management, People Counter
Information Associate, Nov 2007 to July 2010	
•	Application development and maintenance
•	Design/analyze the system
•	Documentation
Skill set – Java, Servlet, JSP, JSLT, EJB, WSDL, SOAP, Hibernate, Structs, HTML, DHTML, CSS, JavaScript, XML, XHTML, Linux, Tomcat, JBoss, Sun Solaries, WebLogic, Oracle, Crystal Report, Hyperion

Analyst Programmer, Sept 2003 to Nov 2007
•	Web application development
•	User support
•	Documentation
Skill set – 
Programming Language - Java, Servlet, JSP, JSLT, EJB, Structs, HTML, DHTML, CSS, JavaScript, XML, XSL, WML, XHTML, ASP, PHP
Database – Oracle, MySQL, MSSQL
Server Operation – Linux, Sun Solaries, Windows Server, Tomcat, JBoss
Technical Support, Sept 1999 to Sept 2001
•	Maintaining server stability
•	Client-side and server-side web programming
•	Creating and maintaining front-end and back-end of website of the company
Skill set – HTML, DHTML, CSS, JavaScript, ASP, JSP, CGI, Windows Server, Sun Solaries

}
