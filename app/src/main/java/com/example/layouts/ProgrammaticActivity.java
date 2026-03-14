package com.example.layouts;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.graphics.Typeface;
import android.graphics.drawable.GradientDrawable;
import android.graphics.Color;

public class ProgrammaticActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Создаем главный LinearLayout
        LinearLayout mainLayout = new LinearLayout(this);
        mainLayout.setLayoutParams(new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.MATCH_PARENT));
        mainLayout.setOrientation(LinearLayout.VERTICAL);

        // Конвертируем 20dp в пиксели
        int padding20 = (int) (20 * getResources().getDisplayMetrics().density);
        mainLayout.setPadding(padding20, padding20, padding20, padding20);

        // Заголовок формы
        TextView title = new TextView(this);
        title.setText("Регистрация");
        title.setTextSize(24);
        title.setTypeface(null, Typeface.BOLD);
        title.setGravity(android.view.Gravity.CENTER_HORIZONTAL);

        LinearLayout.LayoutParams titleParams = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.WRAP_CONTENT,
                LinearLayout.LayoutParams.WRAP_CONTENT);
        titleParams.gravity = android.view.Gravity.CENTER_HORIZONTAL;

        int marginTop20 = (int) (20 * getResources().getDisplayMetrics().density);
        int marginBottom30 = (int) (30 * getResources().getDisplayMetrics().density);
        titleParams.topMargin = marginTop20;
        titleParams.bottomMargin = marginBottom30;

        title.setLayoutParams(titleParams);
        mainLayout.addView(title);

        // Метка "Имя"
        TextView labelName = new TextView(this);
        labelName.setText("Имя:");
        labelName.setTextSize(18);

        LinearLayout.LayoutParams labelNameParams = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.WRAP_CONTENT,
                LinearLayout.LayoutParams.WRAP_CONTENT);

        int marginTop30 = (int) (30 * getResources().getDisplayMetrics().density);
        int marginBottom5 = (int) (5 * getResources().getDisplayMetrics().density);
        labelNameParams.topMargin = marginTop30;
        labelNameParams.bottomMargin = marginBottom5;

        labelName.setLayoutParams(labelNameParams);
        mainLayout.addView(labelName);

        // Поле ввода "Имя"
        EditText inputName = new EditText(this);
        inputName.setHint("Введите ваше имя");
        inputName.setBackgroundColor(0xFFF0F0F0);

        int padding10 = (int) (10 * getResources().getDisplayMetrics().density);
        inputName.setPadding(padding10, padding10, padding10, padding10);

        LinearLayout.LayoutParams inputNameParams = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.WRAP_CONTENT);

        int marginBottom15 = (int) (15 * getResources().getDisplayMetrics().density);
        inputNameParams.bottomMargin = marginBottom15;

        inputName.setLayoutParams(inputNameParams);
        mainLayout.addView(inputName);

        // Метка "E-mail"
        TextView labelEmail = new TextView(this);
        labelEmail.setText("E-mail:");
        labelEmail.setTextSize(18);

        LinearLayout.LayoutParams labelEmailParams = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.WRAP_CONTENT,
                LinearLayout.LayoutParams.WRAP_CONTENT);

        int marginTop5 = (int) (5 * getResources().getDisplayMetrics().density);
        labelEmailParams.topMargin = marginTop5;
        labelEmailParams.bottomMargin = marginBottom5;

        labelEmail.setLayoutParams(labelEmailParams);
        mainLayout.addView(labelEmail);

        // Поле ввода "E-mail"
        EditText inputEmail = new EditText(this);
        inputEmail.setHint("Введите ваш email");
        inputEmail.setBackgroundColor(0xFFF0F0F0);
        inputEmail.setPadding(padding10, padding10, padding10, padding10);

        LinearLayout.LayoutParams inputEmailParams = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.WRAP_CONTENT);
        inputEmailParams.bottomMargin = marginBottom15;

        inputEmail.setLayoutParams(inputEmailParams);
        mainLayout.addView(inputEmail);

        // Метка "Пароль"
        TextView labelPassword = new TextView(this);
        labelPassword.setText("Пароль:");
        labelPassword.setTextSize(18);

        LinearLayout.LayoutParams labelPasswordParams = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.WRAP_CONTENT,
                LinearLayout.LayoutParams.WRAP_CONTENT);
        labelPasswordParams.topMargin = marginTop5;
        labelPasswordParams.bottomMargin = marginBottom5;

        labelPassword.setLayoutParams(labelPasswordParams);
        mainLayout.addView(labelPassword);

        // Поле ввода "Пароль"
        EditText inputPassword = new EditText(this);
        inputPassword.setHint("Введите пароль");
        inputPassword.setInputType(android.text.InputType.TYPE_CLASS_TEXT |
                android.text.InputType.TYPE_TEXT_VARIATION_PASSWORD);
        inputPassword.setBackgroundColor(0xFFF0F0F0);
        inputPassword.setPadding(padding10, padding10, padding10, padding10);

        LinearLayout.LayoutParams inputPasswordParams = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.WRAP_CONTENT);

        int marginBottom25 = (int) (25 * getResources().getDisplayMetrics().density);
        inputPasswordParams.bottomMargin = marginBottom25;

        inputPassword.setLayoutParams(inputPasswordParams);
        mainLayout.addView(inputPassword);

        // Кнопка "Зарегистрироваться" - ЗЕЛЕНАЯ С СИЛЬНО СКРУГЛЕННЫМИ УГЛАМИ
        Button btnRegister = new Button(this);
        btnRegister.setText("Зарегистрироваться");
        btnRegister.setTextSize(16);
        btnRegister.setTextColor(Color.WHITE);
        btnRegister.setAllCaps(false);

        int padding12 = (int) (12 * getResources().getDisplayMetrics().density);
        btnRegister.setPadding(padding12, padding12, padding12, padding12);

        // Создаем скругленный фон для кнопки с большим радиусом
        GradientDrawable roundedButton = new GradientDrawable();
        roundedButton.setColor(0xFF4CAF50); // Зеленый цвет
        roundedButton.setCornerRadius(80); // Увеличил радиус скругления для более круглых углов

        // Устанавливаем скругленный фон
        btnRegister.setBackground(roundedButton);

        LinearLayout.LayoutParams btnParams = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.WRAP_CONTENT);

        btnRegister.setLayoutParams(btnParams);
        mainLayout.addView(btnRegister);

        // Устанавливаем созданный layout как основное содержимое
        setContentView(mainLayout);
    }
}