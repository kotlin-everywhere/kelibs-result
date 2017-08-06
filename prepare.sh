#!/bin/sh

echo "rootProject.name='ktresult'\ninclude 'jdk', 'js'" > settings.gradle
touch build.gradle
jdk/gradlew wrapper
