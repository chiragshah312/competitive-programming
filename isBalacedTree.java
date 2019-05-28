{\rtf1\ansi\ansicpg1252\cocoartf1671
{\fonttbl\f0\fswiss\fcharset0 Helvetica;}
{\colortbl;\red255\green255\blue255;}
{\*\expandedcolortbl;;}
\paperw11900\paperh16840\margl1440\margr1440\vieww10800\viewh8400\viewkind0
\pard\tx566\tx1133\tx1700\tx2267\tx2834\tx3401\tx3968\tx4535\tx5102\tx5669\tx6236\tx6803\pardirnatural\partightenfactor0

\f0\fs24 \cf0 class GfG\
\{\
    \
     /* This function should return tree if passed  tree \
     is balanced, else false. */\
    boolean isBalanced(Node root)\
    \{\
    	if(root == null)\{\
    	    return true;\
    	\}\
    	if(Math.abs(maxHeight(root.left) - maxHeight(root.right)) > 1)\{\
    	    return false;\
    	\}\
    	if(!(isBalanced(root.left) && isBalanced(root.right)))\{\
    	    return false;\
    	\}\
    	return true;\
    \}\
    \
    int maxHeight(Node node)\{\
        if(node == null)\{\
            return 0;\
        \}\
        return (1 + Math.max(maxHeight(node.left), maxHeight(node.right)));\
    \}\
\}\
}