{\rtf1\ansi\ansicpg1252\cocoartf1671
{\fonttbl\f0\fswiss\fcharset0 Helvetica;}
{\colortbl;\red255\green255\blue255;}
{\*\expandedcolortbl;;}
\paperw11900\paperh16840\margl1440\margr1440\vieww10800\viewh8400\viewkind0
\pard\tx566\tx1133\tx1700\tx2267\tx2834\tx3401\tx3968\tx4535\tx5102\tx5669\tx6236\tx6803\pardirnatural\partightenfactor0

\f0\fs24 \cf0 class GfG\
\{\
    boolean isBSTNew(Node current, int parent, int grandParent, int lrIndicator)\{\
        if(current == null)\{\
            return true;\
        \}\
        System.out.println(current.data);\
        boolean l = true;\
        if(current.left != null)\{\
            if(current.left.data > current.data)\{\
                return false;\
            \}\
            if(lrIndicator == 1)\{\
                if(current.left.data > parent)\{\
                    return false;\
                \}\
            \}\
            else if(current.left.data < parent)\{\
                return false;\
            \}\
            l = isBSTNew(current.left, current.data, parent, 1);\
        \}\
        boolean m = true;\
        if(current.right != null)\{\
            if(current.right.data < current.data)\{\
                return false;\
            \}\
            if(lrIndicator == 1)\{\
                if(current.right.data > parent)\{\
                    return false;\
                \}\
            \}\
            else if(current.right.data < parent)\{\
                return false;\
            \}\
            m = isBSTNew(current.right, current.data, parent, 2);\
        \}\
        return (l && m);\
    \}\
    int isBST(Node root)  \
    \{\
        int maxData = root.data;\
        int n = 1;\
        if(isBSTNew(root, maxData, maxData, n))\{\
            return 1;\
        \}\
        return 0;\
    \}\
\}}