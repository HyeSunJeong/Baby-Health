public class MainActivity extends AppCompatActivity {

    //달력 설정
    DatePickerDialog.OnDateSetListener d = new DatePickerDialog.OnDateSetListener() {
        @Override
        public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth){
            Log.d("YearMonthPickerTest", "year = " + year + ", month = " + monthOfYear + ", day = " + dayOfMonth);
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
}

public class MainActivity extends AppCompatActivity {
    ...

    //달력 및 버튼들

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //버튼 가져오기
        Button editBtn = (Button) findViewById(R.id.edit_button);
        Button statisticsBtn = (Button) findViewById(R.id.statistics_button);
        Button stopwatchBtn = (Button) findViewById(R.id.stopwatch_button);

        //"기준 편집"버튼의 이벤트 처리
        editBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Edit.class);
                startActivity(intent);
            }
        });

        //"공부한 양"버튼의 이벤트 처리
        statisticsBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Statistics.class);
                startActivity(intent);
            }
        });

        //"오늘 공부시작!"버튼의 이벤트 처리
        stopwatchBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), StopWatch.class);
                startActivity(intent);
            }
        });
    }
}
