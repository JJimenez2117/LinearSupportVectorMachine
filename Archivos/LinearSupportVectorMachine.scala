//Aún no lo comento, en un rato lo hago y avanzo con lo demás
import org.apache.spark.ml.classification.LinearSVC
import org.apache.spark.sql.SparkSession
val spark = SparkSession.builder.appName("LinearSVCExample").getOrCreate()
val training = spark.read.format("libsvm").load("/Archivos/sample_libsvm_data.txt")
val lsvc = new LinearSVC().setMaxIter(10).setRegParam(0.1)
val lsvcModel = lsvc.fit(training)
println(s"Coefficients: ${lsvcModel.coefficients} Intercept: ${lsvcModel.intercept}")