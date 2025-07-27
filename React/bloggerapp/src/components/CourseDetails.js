// src/components/CourseDetails.js
import React from 'react';

const CourseDetails = ({ courses }) => {
    if (!courses || courses.length === 0) {
        return <p>No courses to show</p>;
    }

    return (
        <div>
            <h2>🎓 Available Courses</h2>
            <ul>
                {courses.map((course) => (
                    <li key={course.id}>
                        <strong>{course.name}</strong> - {course.duration}
                    </li>
                ))}
            </ul>
        </div>
    );
};

export default CourseDetails;
