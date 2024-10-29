package com.example.gmaillist

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class EmailHandle(private val emails: List<Email>) : RecyclerView.Adapter<EmailHandle.EmailViewHolder>() {

    class EmailViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val sender: TextView = itemView.findViewById(R.id.tvSender)
        val subject: TextView = itemView.findViewById(R.id.tvSubject)
        val snippet: TextView = itemView.findViewById(R.id.tvSnippet)
        val time: TextView = itemView.findViewById(R.id.tvTime)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): EmailViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.email_item, parent, false)
        return EmailViewHolder(view)
    }

    override fun onBindViewHolder(holder: EmailViewHolder, position: Int) {
        val email = emails[position]
        holder.sender.text = email.sender
        holder.subject.text = email.subject
        holder.snippet.text = email.snippet
        holder.time.text = email.time
    }

    override fun getItemCount() = emails.size
}
