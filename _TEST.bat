@echo off
cd /d "%~dp0"
call gradlew.bat clean --info
call gradlew.bat runClient --info
pause
