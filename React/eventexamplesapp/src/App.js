import React from 'react';
import Counter from './Counter';
import Welcome from './Welcome';
import SyntheticEventExample from './SyntheticEventExample';
import CurrencyConvertor from './CurrencyConvertor';

const App = () => {
  return (
    <div style={{ padding: '20px' }}>
      <h1>React Event Handling Examples</h1>
      <Counter />
      <Welcome />
      <SyntheticEventExample />
      <CurrencyConvertor />
    </div>
  );
};

export default App;
