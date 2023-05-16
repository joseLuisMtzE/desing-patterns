class CalculateISR {
  constructor() {
    this.estado = "";
    this.importeGravable = null;
  }

  coahuila() {
    return (this.importeGravable * 0.2).toFixed(2);
  }

  durango() {
    return (10 + this.importeGravable * 0.15).toFixed();
  }

  zacatecas() {
    if (this.importeGravable <= 1000) {
      return 100;
    }
    if (this.importeGravable <= 5000) {
      return 200;
    }
    if (this.importeGravable > 5000) {
      return 300;
    }
  }

  setEstadoFunction() {
    switch (this.estado) {
      case "Coahuila":
        return this.coahuila();
      case "Durango":
        return this.durango();
      case "Zacatecas":
        return this.zacatecas();
      default:
        return "no way";
    }
  }

  render() {
    console.log("Estado de la República:", this.estado);
    console.log("Importe gravable:", this.importeGravable);
    if (this.estado) {
      const result = this.setEstadoFunction();
      console.log(`ISR (${this.estado}): ${result}`);
    }
  }

  setEstado(value) {
    this.estado = value;
    if (this.estado && this.importeGravable) {
      this.render();
    }
  }

  setImporteGravable(value) {
    this.importeGravable = value;
    if (this.estado && this.importeGravable) {
      this.render();
    }
  }
}

// ejemplo
const calculator = new CalculateISR();
calculator.setEstado("Coahuila");
calculator.setImporteGravable(1000);

calculator.setEstado("Durango");
calculator.setImporteGravable(1000);

calculator.setEstado("Zacatecas");
calculator.setImporteGravable(1000);
