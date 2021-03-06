import java.io.IOException;
import java.lang.Integer;
import org.apache.hadoop.io.IntWritable; 
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Reducer;
import java.util.List;
import java.util.ArrayList;

public class DataProfilingReducer2 extends Reducer<Text, Text, Text, Text> {
  @Override
  public void reduce(Text key, Iterable<Text> values, Context context) throws IOException, InterruptedException {
    int count = 0;
    for (Text value : values) {
      count += 1;
    }

    String count_str = Integer.toString(count);
    context.write(key, new Text(count_str));
  }
}
