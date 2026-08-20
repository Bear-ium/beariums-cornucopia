@echo off
cd /d "%~dp0"
call gradlew.bat runClient --info
pause
