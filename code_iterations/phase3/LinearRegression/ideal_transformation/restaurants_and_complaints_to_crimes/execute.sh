#!/bin/bash
javac -classpath `yarn classpath` -d . LinearRegressionMapper.java
javac -classpath `yarn classpath` -d . LinearRegressionReducer.java
javac -classpath `yarn classpath`:. -d . LinearRegression.java
jar -cvf LinearRegression.jar *.class
hadoop jar LinearRegression.jar LinearRegression /user/jl11046/Final/phase3/Join/output/ /user/jl11046/Final/phase3/LR/output/ideal_transformation/rts_and_cps_to_cms
