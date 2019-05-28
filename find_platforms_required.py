{\rtf1\ansi\ansicpg1252\cocoartf1671
{\fonttbl\f0\fswiss\fcharset0 Helvetica;}
{\colortbl;\red255\green255\blue255;}
{\*\expandedcolortbl;;}
\paperw11900\paperh16840\margl1440\margr1440\vieww10800\viewh8400\viewkind0
\pard\tx566\tx1133\tx1700\tx2267\tx2834\tx3401\tx3968\tx4535\tx5102\tx5669\tx6236\tx6803\pardirnatural\partightenfactor0

\f0\fs24 \cf0 import copy\
train_input = "10.20am-10.50am"\
trains = \{"P1": ["10.30-12.30"], "P2": ["12.00-14.00"]\}\
\
time_ip = train_input.split('-')[0]\
ampm = time_ip[len(time_ip)-2:len(time_ip)]\
time_ip = float(time_ip[:len(time_ip)-2])\
if ampm == "am":\
    time_ip += 12\
time_op = train_input.split('-')[1]\
ampm = time_op[len(time_op)-2:len(time_op)]\
time_op = float(time_op[:len(time_op)-2])\
if ampm == "am":\
    time_op += 12.0\
    \
if not trains:\
    trains = \{"P1": []\}\
    trains["P1"].append(str(time_ip) + "-" + str(time_op))\
else:\
    temp_trains = copy.deepcopy(trains)\
    trains = temp_trains\
    platform = 1\
    not_found = False\
    for each_platform in trains:\
        for each_train in trains[each_platform]:\
            time_ipt = float(each_train.split('-')[0])\
            time_opt = float(each_train.split('-')[1])\
            if time_ip > time_ipt and time_ip < time_opt:\
                continue\
            if time_op > time_opt and time_op < time_opt:\
                continue\
            temp_trains[each_platform].append(str(time_ip) + "-" + str(time_op))\
            not_found = True\
            break\
        if not_found:\
            break\
        \
    if not_found:\
        platform += 1\
        trains["P" + str(platform)] = str(time_ip) + "-" + str(time_op)\
print(platform)}