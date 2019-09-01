# Read from the file file.txt and output all valid phone numbers to stdout.
grep -P '^(\d{3}-|\(\d{3}\) )\d{3}-\d{4}$' file.txt
#-P表示使用正则
#^$是开始和结束符号
#\d{3}表示三位整数