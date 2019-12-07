package com.example.student;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class StudentsAdapter extends RecyclerView.Adapter<StudentsAdapter.NoteVh> {


    Context context;
    List<Student> students;

    public StudentsAdapter(Context context, List<Student> students) {
        this.context = context;
        this.students = students;
    }

    @NonNull
    @Override
    public NoteVh onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.row_note, parent, false);
        return new NoteVh(view);
    }

    @Override
    public void onBindViewHolder(@NonNull NoteVh holder, int position) {
        holder.setData(students.get(position));
    }

    @Override
    public int getItemCount() {
        return students.size();
    }


    class NoteVh extends RecyclerView.ViewHolder {

        TextView note_title, note_desc, note_date;

        public NoteVh(@NonNull View itemView) {
            super(itemView);
            note_title = itemView.findViewById(R.id.note_title);
            note_desc = itemView.findViewById(R.id.note_desc);
            note_date = itemView.findViewById(R.id.note_date);

        }

        public void setData(final Student student) {
            note_title.setText(student.getName());
            note_desc.setText(student.getLevel());
            note_date.setText(student.getAge() + "");

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(itemView.getContext(), StudentActivity.class);
                    intent.putExtra("id", student.getId());
                    intent.putExtra("name", student.getName());
                    intent.putExtra("level", student.getLevel());
                    intent.putExtra("age", student.getAge());
                    itemView.getContext().startActivity(intent);
                }
            });
        }
    }
}
