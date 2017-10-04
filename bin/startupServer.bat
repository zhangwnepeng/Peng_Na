@echo off
cd ..\peng_na_server
%call mvn compile%
mvn exec:java -Dexec.mainClass="org.zwp.common.restful.RestFulServer" 