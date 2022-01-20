#!/bin/sh
set -e
exec java -Xms102m -Xmx204m -XX:MaxRAM=256m -jar app.jar