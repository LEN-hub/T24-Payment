@echo off
set proPath= "%~dp0"
@REM set browserPath= "C:\Users\yangkan\AppData\Local\Google\Chrome\Application"
cd %proPath%
call mvn clean verify
@REM cd /d %browserPath%
@REM for /f "delims=" %%i in ('dir chrome.exe /b/s ') do (
@REM     start "" "%%i" http://10.211.55.3:8082/job/GreenBank_test/HTML_20Report/
@REM )
exit