
import scala.io.Source;

//copied file locally https://archive.ics.uci.edu/ml/machine-learning-databases/iris/iris.data
val filename = "iris.data"
//println("SepalLength, SepalWidth, PetalLength, PetalWidth, Class");

//load iris data into an array
val array = scala.collection.mutable.ArrayBuffer.empty[Float]
for (line <- Source.fromFile(filename).getLines) {
    var cols = line.split(",").map(_.trim);
    //println(s"${cols(0)}|${cols(1)}|${cols(2)}|${cols(3)} |${cols(4)}");
    val i = cols(0).toFloat
    array += i;
}

//get some minimal statistics
val count = array.length;
var min:Double = 9999.0;
var max:Double = 0.0;
var total:Double = 0.0;
for ( x <- array ) {
    if (x < min) { min = x; }
    if (x > max) { max = x; }
    total += x;     
}
val mean:Double = total / count;
