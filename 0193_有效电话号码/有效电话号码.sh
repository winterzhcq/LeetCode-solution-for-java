# Read from the file file.txt and output all valid phone numbers to stdout.
grep -P '^(\d{3}-|\(\d{3}\) )\d{3}-\d{4}$' file.txt
#-P��ʾʹ������
#^$�ǿ�ʼ�ͽ�������
#\d{3}��ʾ��λ����