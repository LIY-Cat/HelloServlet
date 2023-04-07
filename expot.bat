@echo off
set MYSQL_PATH="C:\Program Files\MySQL\MySQL Server 8.0\bin"
set DB_HOST=localhost
set DB_USER=root
set DB_PASS=dongyang
set DB_NAME=database
set TABLE_NAME=table_name

%MYSQL_PATH%\mysql -u %DB_USER% -p%DB_PASS% -h %DB_HOST% -e "SELECT column1, column2, column3 FROM %DB_NAME%.%TABLE_NAME%" -B > data.txt

set /p header=<data.txt
echo %header% > data.csv

for /f "skip=1 tokens=*" %%a in (data.txt) do (
    echo %%a | tr -d '\r' >> data.csv
)

del data.txt
