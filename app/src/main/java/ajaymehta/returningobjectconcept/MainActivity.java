package ajaymehta.returningobjectconcept;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    MyWork myWork = new MyWork();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public Object objectIsHere() {
        return myWork;   //returning an object means it will call its call n also execute its constructor
    }


    public void play(View view) {
      MyWork mm = (MyWork) objectIsHere();  //then m getting object here
        mm.showWork(); //then calling its other methods.. cool
    }


    public class MyWork {

        MyWorkBean myWorkBean = new MyWorkBean();

        MyWork() {

            myWorkBean.setName("HomeWork");
            myWorkBean.setTime("2");
            myWorkBean.setType("Important");


        }

        public void showWork() {

            Log.d("ajaymehta", "My WOrk is: " + myWorkBean.getName()+" "+myWorkBean.getType());
        }


    }
}
