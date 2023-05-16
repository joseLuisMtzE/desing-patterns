//? ejemplo en linea: https://stackblitz.com/edit/react-vuihvh?file=src%2FCalculateISR.js

import React, { useState, useEffect } from "react";

export default function CalculateISR() {
  const [estado, setEstado] = useState("");
  const [importeGravable, setImporteGravable] = useState(null);

  const coahuila = () => {
    return (importeGravable * 0.2).toFixed(2);
  };
  const durango = () => {
    return (10 + importeGravable * 0.15).toFixed();
  };
  const zacatecas = () => {
    if (importeGravable <= 1000) {
      return 100;
    }
    if (importeGravable <= 5000) {
      return 200;
    }
    if (importeGravable > 5000) {
      return 300;
    }
  };

  const setEstadoFunction = () => {
    switch (estado) {
      case "Coahuila":
        return coahuila();
      case "Durango":
        return durango();
      case "Zacatecas":
        return zacatecas();
      default:
        return "no way";
    }
  };

  const handleOnChange = (e) => {
    setEstado(e.target.value);
  };

  useEffect(() => {
    setEstadoFunction();
  }, [estado, importeGravable]);

  return (
    <div>
      <p>
        <label>Estado de la República: </label>
        <select input={true} value={estado} onChange={handleOnChange}>
          <option value="" disabled>
            Seleccione un estado
          </option>
          <option value="Coahuila">Coahuila</option>
          <option value="Durango">Durango</option>
          <option value="Zacatecas">Zacatecas</option>
        </select>
      </p>
      <p>
        <label htmlFor="importeGravable">Importe gravable: </label>
        <input
          name="importeGravable"
          type="number"
          min="0"
          onChange={(e) => setImporteGravable(e.target.value)}
          value={importeGravable}
        />
      </p>
      {estado && (
        <p>
          ISR ({estado}): {setEstadoFunction()}
        </p>
      )}
    </div>
  );
}
