import React from "react";
import "./App.css";

const officeSpaces = [
  {
    name: "Elite Office Hub",
    rent: 55000,
    address: "Mount Road, Chennai",
    image: "https://res.cloudinary.com/myhq/image/upload/workspaces/elite-businesscentre-kukatpally/ebqnf5.jpg"
  },
  {
    name: "TechZone Workspace",
    rent: 75000,
    address: "Tidel Park, Chennai",
    image: "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQ8NdQLS_j2u4Mptw2Hm89ZW79vJqlLFSmGbA&s"
  },
  {
    name: "StartUp Hub",
    rent: 62000,
    address: "Guindy, Chennai",
    image: "https://www.nulondon.ac.uk/wp-content/uploads/2025/02/NEU-VineStreet-16-HighRes-scaled.jpg"
  }
];

function App() {
  return (
    <div style={{ padding: "20px", fontFamily: "Arial" }}>

      <h1 style={{ color: "#333", textAlign: "center" }}>
        Office Space Rental App
      </h1>

      {officeSpaces.map((office, index) => {
        const rentStyle = {
          color: office.rent < 60000 ? "red" : "green",
          fontWeight: "bold"
        };

        return (
          <div
            key={index}
            style={{
              border: "1px solid #ccc",
              borderRadius: "10px",
              padding: "15px",
              margin: "15px 0",
              boxShadow: "0 0 8px rgba(0,0,0,0.1)"
            }}
          >

            <img
              src={office.image}
              alt={office.name}
              style={{ width: "20%", borderRadius: "10px" }}
            />
            <h2>{office.name}</h2>
            <p>
              <strong>Rent:</strong>{" "}
              <span style={rentStyle}>₹{office.rent}</span>
            </p>
            <p>
              <strong>Address:</strong> {office.address}
            </p>
          </div>
        );
      })}
    </div>
  );
}

export default App;
