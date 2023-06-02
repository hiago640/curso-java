package secao06_arrays_collections.curso.collections.list;

import java.util.Objects;

public class Smartphone {

	private String serialNumber;
	private String marca;

	public Smartphone(String serialNumber, String marca) {
		this.serialNumber = serialNumber;
		this.marca = marca;
	}

	public String getSerialNumber() {
		return serialNumber;
	}

	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	@Override
	public int hashCode() {
		return Objects.hash(marca, serialNumber);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Smartphone))
			return false;
		Smartphone other = (Smartphone) obj;
		return Objects.equals(marca, other.marca) && Objects.equals(serialNumber, other.serialNumber);
	}

	@Override
	public String toString() {
		return String.format("Smartphone [serialNumber=%s, marca=%s]", serialNumber, marca);
	}
}
