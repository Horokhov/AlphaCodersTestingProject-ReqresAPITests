# AlphaCodersTestingProject-ReqresAPITests
Testing https://alphacoders.com/ webSite/https://reqres.in/ API & building framework using Selenide, TestNG, Jenkins, Maven Surefire Plugin, Allure, Rest Assured, Jackson Databind, Slf4j-api,
Logback classic, Json-simple

Git repository URL: https://github.com/Horokhov/AlphaCodersTestingProject-ReqresAPITests;
Jenkins configuration: Build steps -> Invoke top-Maven targets -> test -Dbrowser="$browserDriver"

This project is parametrized -> Choice Parameter name: browserDriver 
Choices: 
edge
edgeheadless
firefox
firefoxheadless
chrome
chromeheadless
