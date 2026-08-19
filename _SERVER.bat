@echo off
cd /d "%~dp0"
call gradlew.bat runServer --info
pause