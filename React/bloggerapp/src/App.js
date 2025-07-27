import React, { useState } from 'react';
import BookDetails from './components/BookDetails';
import BlogDetails from './components/BlogDetails';
import CourseDetails from './components/CourseDetails';
import './App.css';

function App() {
  const [activeTab, setActiveTab] = useState('books');

  const books = [
    { title: 'React Basics', author: 'Dan Abramov' },
    { title: 'JavaScript Deep Dive', author: 'Kyle Simpson' },
  ];

  const blogs = [
    { title: 'Understanding JSX', summary: 'JSX simplifies UI declaration.' },
    { title: 'Hooks in React', summary: 'Use hooks for managing state & side-effects.' },
  ];

  const courses = [
    { id: 1, name: 'React Fundamentals', duration: '3 weeks' },
    { id: 2, name: 'Advanced React', duration: '2 weeks' },
  ];

  return (
    <div className="App">
      <h1>Blogger App</h1>


      <button onClick={() => setActiveTab('books')}>Book Details</button>
      <button onClick={() => setActiveTab('blogs')}>Blog Details</button>
      <button onClick={() => setActiveTab('courses')}>Course Details</button>

      <hr />


      {activeTab === 'books' ? (
        <BookDetails books={books} />
      ) : activeTab === 'blogs' ? (
        <BlogDetails blogs={blogs} />
      ) : (
        <CourseDetails courses={courses} />
      )}


    </div>
  );
}

export default App;
