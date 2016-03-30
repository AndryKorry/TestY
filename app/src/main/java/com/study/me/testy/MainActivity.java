package com.study.me.testy;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements ImageView.OnClickListener {


  TextView txtOne,textView_status;
  TextView textView_create,textView_create_data;
  TextView textView_registraited, textView_registraited_data;
  TextView textView_to_solve, textView_to_solve_data;
  TextView textView_responsible, textView_responsible_organization;
  TextView description;
  ImageView indicator_status;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.main);

    txtOne = (TextView) findViewById(R.id.txtOne);
    txtOne.setOnClickListener(this);

    textView_status= (TextView) findViewById(R.id.textView_status);
    textView_status.setOnClickListener(this);

    textView_create= (TextView) findViewById(R.id.textView_create);
    textView_create.setOnClickListener(this);

    textView_create_data = (TextView) findViewById(R.id.textView_create_data);
    textView_create_data.setOnClickListener(this);

    textView_registraited= (TextView) findViewById(R.id.textView_registraited);
    textView_registraited.setOnClickListener(this);

    textView_registraited_data= (TextView) findViewById(R.id.textView_registraited_data);
    textView_registraited_data.setOnClickListener(this);

    textView_to_solve= (TextView) findViewById(R.id.textView_to_solve);
    textView_to_solve.setOnClickListener(this);

    textView_to_solve_data= (TextView) findViewById(R.id.textView_to_solve_data);
    textView_to_solve_data.setOnClickListener(this);

    textView_responsible= (TextView) findViewById(R.id.textView_responsible);
    textView_responsible.setOnClickListener(this);

    textView_responsible_organization= (TextView) findViewById(R.id. textView_responsible_organization);
    textView_responsible_organization.setOnClickListener(this);

    description= (TextView) findViewById(R.id.description);
    description.setOnClickListener(this);

    indicator_status = (ImageView) findViewById(R.id.indicator_status);
    indicator_status.setOnClickListener(this);

  }

  @Override
  public void onClick(View v) {

    switch(v.getId()){
      case R.id.txtOne:
        Toast.makeText(this, "TextView " , Toast.LENGTH_SHORT).show();
        break;
      case R.id.textView_status:
        Toast.makeText(this, "TextView" , Toast.LENGTH_SHORT).show();
        break;
      case R.id.textView_create:
        Toast.makeText(this, "TextView" , Toast.LENGTH_SHORT).show();
        break;
      case R.id.textView_create_data:
        Toast.makeText(this, "TextView" , Toast.LENGTH_SHORT).show();
        break;
      case R.id.textView_registraited:
        Toast.makeText(this, "TextView" , Toast.LENGTH_SHORT).show();
        break;
      case R.id.textView_registraited_data:
        Toast.makeText(this, "TextView" , Toast.LENGTH_SHORT).show();
        break;
      case R.id.textView_to_solve:
        Toast.makeText(this, "TextView" , Toast.LENGTH_SHORT).show();
        break;
      case R.id.textView_to_solve_data:
        Toast.makeText(this, "TextView" , Toast.LENGTH_SHORT).show();
        break;
      case R.id.textView_responsible:
        Toast.makeText(this, "TextView" , Toast.LENGTH_SHORT).show();
        break;
      case R.id.textView_responsible_organization:
        Toast.makeText(this, "TextView" , Toast.LENGTH_SHORT).show();
        break;
      case R.id.description:
        Toast.makeText(this, "TextView" , Toast.LENGTH_SHORT).show();
        break;
      case R.id.indicator_status:
        Toast.makeText(this, "ImageView" , Toast.LENGTH_SHORT).show();
        break;

      default:
        break;
    }

  }
}
