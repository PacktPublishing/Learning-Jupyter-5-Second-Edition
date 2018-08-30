
.. code:: scala

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




.. parsed-literal::

    [32mimport [39m[36mscala.io.Source;
    
    //copied file locally https://archive.ics.uci.edu/ml/machine-learning-databases/iris/iris.data
    [39m
    [36mfilename[39m: [32mString[39m = [32m"iris.data"[39m
    [36marray[39m: [32mcollection[39m.[32mmutable[39m.[32mArrayBuffer[39m[[32mFloat[39m] = [33mArrayBuffer[39m(
      [32m5.1F[39m,
      [32m4.9F[39m,
      [32m4.7F[39m,
      [32m4.6F[39m,
      [32m5.0F[39m,
      [32m5.4F[39m,
      [32m4.6F[39m,
      [32m5.0F[39m,
      [32m4.4F[39m,
      [32m4.9F[39m,
      [32m5.4F[39m,
    [33m...[39m
    [36mcount[39m: [32mInt[39m = [32m150[39m
    [36mmin[39m: [32mDouble[39m = [32m4.300000190734863[39m
    [36mmax[39m: [32mDouble[39m = [32m7.900000095367432[39m
    [36mtotal[39m: [32mDouble[39m = [32m876.4999990463257[39m
    [36mmean[39m: [32mDouble[39m = [32m5.843333326975505[39m


