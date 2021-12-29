package com.vijanaweusi.mitihaniapp

import android.content.Intent
import android.graphics.Color
import android.graphics.Typeface
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import com.vijanaweusi.mitihaniapp.databinding.ActivityQuizBinding

class QuizActivity: AppCompatActivity(), View.OnClickListener {

    private var mCurrentPosition: Int = 1
    private var mQuestionsList: ArrayList<Questions>? = null
    private var mSelectedOptionPosition: Int = 0
    private var mCorrectAnswers: Int = 0

    private lateinit var binding: ActivityQuizBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityQuizBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.tvOptionOne.setOnClickListener(this)
        binding.tvOptionTwo.setOnClickListener(this)
        binding.tvOptionThree.setOnClickListener(this)
        binding.tvOptionFour.setOnClickListener(this)
        binding.btnSubmit.setOnClickListener(this)


        // Gets questions from Constants list
        if (intent.getStringExtra("lugha")=="Mtihani wa kwanza") {
            mQuestionsList = Constants.getQuestions()
            setQuestion()
        } else if (intent.getStringExtra("lugha")=="Mtihani wa pili") {
            mQuestionsList = Constants.getQuestionsPili()
            setQuestion()
        } else if (intent.getStringExtra("lugha")=="Mtihani wa tatu") {
            mQuestionsList = Constants.getQuestionsTatu()
            setQuestion()
        } else if (intent.getStringExtra("lugha")== "Mtihani wa nne") {
            mQuestionsList = Constants.getQuestionsNne()
            setQuestion()
        }
    }

    private fun setQuestion() {

        val questions = mQuestionsList!![mCurrentPosition - 1]

        defaultOptionsView()

        if (mCurrentPosition == mQuestionsList!!.size) {
            binding.btnSubmit.text = "Maliza"
        }else{
            binding.btnSubmit.text = "Wasilisha"
        }

        binding.progressBar.progress = mCurrentPosition
        binding.tvProgress.text = "$mCurrentPosition" + "/" + binding.progressBar.max
        binding.tvQuestion.text = questions.question
        binding.tvOptionOne.text = questions.optionOne
        binding.tvOptionTwo.text = questions.optionTwo
        binding.tvOptionThree.text = questions.optionThree
        binding.tvOptionFour.text = questions.optionFour
    }

    private fun defaultOptionsView() {
        val options = ArrayList<TextView>()
        options.add(0, binding.tvOptionOne)
        options.add(1, binding.tvOptionTwo)
        options.add(2, binding.tvOptionThree)
        options.add(3, binding.tvOptionFour)

        for (option in options) {
            option.setTextColor(Color.parseColor("#7A8089"))
            option.typeface = Typeface.DEFAULT
            option.background = ContextCompat.getDrawable(this, R.drawable.default_option_border_bg)
        }
    }

    override fun onClick(v: View?) {
        when(v?.id){
            R.id.tv_option_one -> {
                selectedOptionView(binding.tvOptionOne,1)
            }
            R.id.tv_option_two -> {
                selectedOptionView(binding.tvOptionTwo,2)
            }
            R.id.tv_option_three -> {
                selectedOptionView(binding.tvOptionThree,3)
            }
            R.id.tv_option_four -> {
                selectedOptionView(binding.tvOptionFour,4)
            }
            R.id.btn_submit -> {
                if(mSelectedOptionPosition == 0) {
                    mCurrentPosition ++

                    when {
                        mCurrentPosition <= mQuestionsList!!.size -> {
                            setQuestion()
                        }else ->{
                        val intent = Intent(this, ResultActivity::class.java)
                        intent.putExtra(Constants.CORRECT_ANSWERS, mCorrectAnswers)
                        intent.putExtra(Constants.TOTAL_QUESTION, mQuestionsList!!.size)
                        startActivity(intent)
                    }
                    }
                }else {
                    val question = mQuestionsList?.get(mCurrentPosition -1)
                    if(question!!.correctAnswer != mCurrentPosition) {
                        answerView(mSelectedOptionPosition, R.drawable.wrong_option_border_bg)
                    }else{
                        mCorrectAnswers++
                    }
                    answerView(question.correctAnswer, R.drawable.correct_option_border_bg)

                    if (mCurrentPosition == mQuestionsList!!.size) {
                        binding.btnSubmit.text = "Maliza"
                    }else{
                        binding.btnSubmit.text = "Nenda kwa swali linalofuata"
                    }
                    mSelectedOptionPosition = 0
                }
            }
        }

    }

    private fun answerView(answer: Int, drawableView: Int) {
        when(answer) {
            1 -> {
                binding.tvOptionOne.background = ContextCompat.getDrawable(this, drawableView)
            }
            2 -> {
                binding.tvOptionTwo.background = ContextCompat.getDrawable(this, drawableView)
            }
            3 -> {
                binding.tvOptionThree.background = ContextCompat.getDrawable(this, drawableView)
            }
            4 -> {
                binding.tvOptionFour.background = ContextCompat.getDrawable(this, drawableView)
            }
        }
    }


    private  fun selectedOptionView(tv: TextView, selectedOptionNum: Int) {

        defaultOptionsView()
        mSelectedOptionPosition = selectedOptionNum

        tv.setTextColor(Color.parseColor("#363A43"))
        tv.setTypeface(tv.typeface, Typeface.BOLD)
        tv.background = ContextCompat.getDrawable(this, R.drawable.selected_option_border)

    }
}
