package com.fiap.mvp_project

import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.util.Pair
import android.view.View
import android.widget.Button
import android.widget.FrameLayout
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.fiap.mvp_project.model.User

class ActivityDates : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dates)

        val raquel = User("RAQUEL ALVES",
                "(12) 9456-5880", "engraquel",
                "@drawable/raquel",
                arrayOf(
                        Pair(findViewById(R.id.raquel15062022), "#39D353"),
                        Pair(findViewById(R.id.raquel29062022), "#39D353"),
                        Pair(findViewById(R.id.raquel15072022), "#39D353"),
                        Pair(findViewById(R.id.raquel27072022), "#39D353"),
                        Pair(findViewById(R.id.raquel31072022), "#39D353")
                ),
                arrayOf(findViewById(R.id._15062022),
                        findViewById(R.id._29062022),
                        findViewById(R.id._15072022),
                        findViewById(R.id._27072022),
                        findViewById(R.id._31072022)
                )
        )

        val vitor = User("VITOR NEVES",
                "(12) 7456-7880", "vitorconstrucao",
                "@drawable/vitor",
                arrayOf(
                        Pair(findViewById(R.id.vitor18062022), "#21262D"),
                        Pair(findViewById(R.id.vitor30062022), "#21262D"),
                        Pair(findViewById(R.id.vitor01072022), "#26A641"),
                        Pair(findViewById(R.id.vitor03072022), "#0E4429"),
                        Pair(findViewById(R.id.vitor04072022), "#21262D"),
                        Pair(findViewById(R.id.vitor05072022), "#006D32"),
                        Pair(findViewById(R.id.vitor17072022), "#0E4429"),
                        Pair(findViewById(R.id.vitor18072022), "#006D32"),
                        Pair(findViewById(R.id.vitor19072022), "#0E4429"),
                        Pair(findViewById(R.id.vitor20072022), "#21262D")
                ),
                arrayOf(findViewById(R.id._18062022),
                        findViewById(R.id._30062022),
                        findViewById(R.id._01072022),
                        findViewById(R.id._03072022),
                        findViewById(R.id._04072022),
                        findViewById(R.id._05072022),
                        findViewById(R.id._17072022),
                        findViewById(R.id._18072022),
                        findViewById(R.id._19072022),
                        findViewById(R.id._20072022)
                )
        )

        val danielle = User("DANIELLE MOURA",
                "(12) 4456-7860", "arqdanielle",
                "@drawable/danielle",
                arrayOf(
                        Pair(findViewById(R.id.danielle12062022), "#26A641"),
                        Pair(findViewById(R.id.danielle13062022), "#006D32"),
                        Pair(findViewById(R.id.danielle14062022), "#006D32"),
                        Pair(findViewById(R.id.danielle20062022), "#0E4429"),
                        Pair(findViewById(R.id.danielle08072022), "#26A641"),
                        Pair(findViewById(R.id.danielle09072022), "#26A641"),
                        Pair(findViewById(R.id.danielle21072022), "#21262D"),
                        Pair(findViewById(R.id.danielle22072022), "#006D32"),
                        Pair(findViewById(R.id.danielle24072022), "#21262D"),
                        Pair(findViewById(R.id.danielle25072022), "#39D353")
                ),
                arrayOf(findViewById(R.id._12062022),
                        findViewById(R.id._13062022),
                        findViewById(R.id._14062022),
                        findViewById(R.id._20062022),
                        findViewById(R.id._08072022),
                        findViewById(R.id._09072022),
                        findViewById(R.id._21072022),
                        findViewById(R.id._22072022),
                        findViewById(R.id._24072022),
                        findViewById(R.id._25072022)
                )
        )

        val elias = User("ELIAS DOS SANTOS",
                "(12) 3456-7890", "eliaspintor",
                "@drawable/elias",
                arrayOf(
                        Pair(findViewById(R.id.elias07062022), "#006D32"),
                        Pair(findViewById(R.id.elias08062022), "#39D353"),
                        Pair(findViewById(R.id.elias22062022), "#0E4429"),
                        Pair(findViewById(R.id.elias23062022), "#39D353"),
                        Pair(findViewById(R.id.elias24062022), "#006D32"),
                        Pair(findViewById(R.id.elias28062022), "#39D353"),
                        Pair(findViewById(R.id.elias11072022), "#006D32"),
                        Pair(findViewById(R.id.elias12072022), "#39D353"),
                        Pair(findViewById(R.id.elias13072022), "#26A641"),
                        Pair(findViewById(R.id.elias30072022), "#0E4429"),
                        Pair(findViewById(R.id.elias03082022), "#39D353")
                ),
                arrayOf(findViewById(R.id._07062022),
                        findViewById(R.id._08062022),
                        findViewById(R.id._22062022),
                        findViewById(R.id._23062022),
                        findViewById(R.id._24062022),
                        findViewById(R.id._28062022),
                        findViewById(R.id._11072022),
                        findViewById(R.id._12072022),
                        findViewById(R.id._13072022),
                        findViewById(R.id._30072022),
                        findViewById(R.id._03082022)
                )
        )


        val backButton = findViewById<Button>(R.id.back_button)
        val nome = findViewById<TextView>(R.id.text_View)
        val tel = findViewById<TextView>(R.id.textView13)
        val tag = findViewById<TextView>(R.id.textView14)
        val img = findViewById<FrameLayout>(R.id.img)

        val user = getIntent().getStringExtra("USER")

        if (user != null) {

            when {
                user.equals("elias") -> {

                    val imageResource = resources.getIdentifier(elias.img, null, packageName)

                    nome.text = elias.name
                    tel.text = elias.tel
                    tag.text = elias.tag
                    img.background = getResources().getDrawable(imageResource)

                    for(b in elias.buttonObjs)
                        b.setEnabled(true)

                    for(c in elias.circles)
                        c.first.setCardBackgroundColor(Color.parseColor(c.second))

                }
                user.equals("danielle") -> {
                    val imageResource = resources.getIdentifier(danielle.img, null, packageName)
                    nome.text = danielle.name
                    tel.text = danielle.tel
                    tag.text = danielle.tag
                    img.background = getResources().getDrawable(imageResource)

                    for(b in danielle.buttonObjs)
                        b.setEnabled(true)

                    for(c in danielle.circles)
                        c.first.setCardBackgroundColor(Color.parseColor(c.second))

                }
                user.equals("vitor") -> {
                    val imageResource = resources.getIdentifier(vitor.img, null, packageName)
                    nome.text = vitor.name
                    tel.text = vitor.tel
                    tag.text = vitor.tag
                    img.background = getResources().getDrawable(imageResource)

                    for(b in vitor.buttonObjs)
                        b.setEnabled(true)

                    for(c in vitor.circles)
                        c.first.setCardBackgroundColor(Color.parseColor(c.second))

                }
                user.equals("raquel") -> {
                    val imageResource = resources.getIdentifier(raquel.img, null, packageName)
                    nome.text = raquel.name
                    tel.text = raquel.tel
                    tag.text = raquel.tag
                    img.background = getResources().getDrawable(imageResource)

                    for(b in raquel.buttonObjs)
                        b.setEnabled(true)

                    for(c in raquel.circles)
                        c.first.setCardBackgroundColor(Color.parseColor(c.second))

                }
            }

        }

        backButton.setOnClickListener{
            val intent = Intent(this, ActivityList::class.java)

            startActivity(intent)
        }



    }

    fun goToElias(v: View){
        val intent = Intent(this, ActivityTime::class.java)
        val button : Button = v as Button
        val d = button.getText().subSequence(1,3)
        val m = button.getText().subSequence(3,5)
        val a = button.getText().subSequence(5,9)
        intent.putExtra("DATE", "${d}/${m}/${a}");
        intent.putExtra("USER", "elias");
        startActivity(intent)
    }

    fun goToDanielle(v: View){
        val intent = Intent(this, ActivityTime::class.java)
        val button : Button = v as Button
        val d = button.getText().subSequence(1,3)
        val m = button.getText().subSequence(3,5)
        val a = button.getText().subSequence(5,9)
        intent.putExtra("DATE", "${d}/${m}/${a}");
        intent.putExtra("USER", "danielle");
        startActivity(intent)
    }

    fun goToVitor(v: View){
        val intent = Intent(this, ActivityTime::class.java)
        val button : Button = v as Button
        val d = button.getText().subSequence(1,3)
        val m = button.getText().subSequence(3,5)
        val a = button.getText().subSequence(5,9)
        intent.putExtra("DATE", "${d}/${m}/${a}");
        intent.putExtra("USER", "vitor");
        startActivity(intent)
    }

    fun goToRaquel(v: View){
        val intent = Intent(this, ActivityTime::class.java)
        val button : Button = v as Button
        val d = button.getText().subSequence(1,3)
        val m = button.getText().subSequence(3,5)
        val a = button.getText().subSequence(5,9)
        intent.putExtra("DATE", "${d}/${m}/${a}");
        intent.putExtra("USER", "raquel");
        startActivity(intent)
    }

}