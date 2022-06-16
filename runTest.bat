@echo off
set proPath= "%~dp0"
set browserPath= "C:\Users\yangkan\AppData\Local\Google\Chrome\Application"
cd %proPath%
call mvn clean verify
cd /d %browserPath%
for /f "delims=" %%i in ('dir chrome.exe /b/s ') do (
    start "" "%%i" http://10.211.55.3:8082/job/GreenBank_test/HTML_20Report/
)
exit