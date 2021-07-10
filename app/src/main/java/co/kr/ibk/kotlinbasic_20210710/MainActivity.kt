package co.kr.ibk.kotlinbasic_20210710

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        testBtn.setOnClickListener {

            Log.d("메인화면","테스트 버튼 클릭됨")
            Log.i("메인화면", "두번째 버튼 클릭")


        }
        setOn
    }
}