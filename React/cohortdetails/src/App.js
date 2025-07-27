// src/App.js
import React from 'react';
import './App.css';
import CohortDetails from './components/CohortDetails';

const App = () => {
  const cohorts = [
    { name: 'React Bootcamp', trainer: 'John', duration: '4 Weeks', status: 'ongoing' },
    { name: 'Java Basics', trainer: 'Mary', duration: '3 Weeks', status: 'completed' },
    { name: 'Python Pro', trainer: 'Sam', duration: '5 Weeks', status: 'ongoing' },
  ];

  return (
    <div className="App">
      <h1>Cohort Dashboard</h1>
      {cohorts.map((cohort, index) => (
        <CohortDetails key={index} cohort={cohort} />
      ))}
    </div>
  );
};

export default App;
