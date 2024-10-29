package com.example.gmaillist

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val emails = listOf(
            Email("Alice", "Meeting tomorrow", "Please remember our meeting at 10 AM.", "9:30 AM"),
            Email("Bob", "Lunch?", "Would you like to have lunch together?", "8:45 AM"),
            Email("Charlie", "Project Update", "Here's the latest update on the project.", "Yesterday"),
            Email("Dave", "Vacation Request", "I would like to request vacation time.", "Yesterday"),
            Email("Eve", "Dinner plans", "Are you free for dinner tonight?", "2 days ago"),
            Email("Frank", "Report Submission", "The report is ready for your review.", "1 hour ago"),
            Email("Grace", "Conference Details", "Here are the details for the upcoming conference.", "3 hours ago"),
            Email("Hannah", "Invoice Reminder", "This is a reminder for the invoice due date.", "1 day ago"),
            Email("Ivy", "Feedback Request", "Could you please provide your feedback?", "2 days ago"),
            Email("Jack", "Weekly Update", "Here's your weekly update on project progress.", "3 days ago"),
            Email("Kate", "Job Offer", "Congratulations! You have a job offer.", "4 days ago"),
            Email("Leo", "Appointment Confirmation", "Your appointment has been confirmed.", "5 days ago"),
            Email("Mia", "New Feature", "Check out the new feature we added to the app.", "6 days ago"),
            Email("Nina", "Product Launch", "We're excited to announce the product launch!", "1 week ago"),
            Email("Oscar", "Thank You", "Thank you for your help on the project.", "1 week ago"),
            Email("Paul", "Follow-up", "Just following up on our previous conversation.", "1 week ago")
        )


        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = EmailHandle(emails)
    }
}
