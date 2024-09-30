# FleetDryRun
Java-SpringBoot-RabbitMQ-PostgreSQL POC

pre·requis·ite <br />

*Install Docker <br />
*Pull Rabbit Mq Image <br />
*Run The Image in the Docker <br /> 

Docker Image related Port Numbers <br />
docker run --rm -it -p 15672:15672 -p 5672:5672 rabbitmq:4.0.2-management <br />

*Make sure You have postgre Sql Installed in your System <br />
Just make changes to app.props file postgreSQL connection as per your local settings. <br />
