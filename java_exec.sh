#/bin/bash

JAVA_FILE=$1

#cat $JAVA_FILE
if [ ! -f $PWD/$JAVA_FILE ] || [ ! -f $JAVA_FILE ]; then
	echo "$JAVA_FILE not found in current directory"
        exit 1
fi

javac $JAVA_FILE
if [ $? -ne 0 ]; then
   echo "you recieved error. Please fix and rerun"
   exit 1
fi

JAVA_CLASS="$(echo $JAVA_FILE | cut -d '.' -f 1)"
echo $JAVA_CLASS
java $JAVA_CLASS

echo "Cleaning up Java Class Files"
rm *.class
