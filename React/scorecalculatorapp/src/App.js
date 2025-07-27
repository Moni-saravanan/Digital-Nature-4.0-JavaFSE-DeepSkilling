import logo from './logo.svg';
import './App.css';
import { CalculateScore } from './Components/CalculateScore';
function App() {
  return (
    <div>
      <CalculateScore name={"Steve"} school={"ABC school"} total={284} goal={3}></CalculateScore>
    </div>
  );
}

export default App;
