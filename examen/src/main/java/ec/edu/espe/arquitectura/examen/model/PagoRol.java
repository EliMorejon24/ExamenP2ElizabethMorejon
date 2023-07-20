package ec.edu.espe.arquitectura.examen.model;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public class PagoRol {
    private String mes;
    private Date fechaProceso;
    private String rucEmpresa;
    private String cuentaPrincipal;
    private BigDecimal valorTotal;
    private BigDecimal valorReal;
    private List<EmpleadosPago> empleadosPago;
    
    public PagoRol() {
    }

    public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

    public Date getFechaProceso() {
        return fechaProceso;
    }

    public void setFechaProceso(Date fechaProceso) {
        this.fechaProceso = fechaProceso;
    }

    public String getRucEmpresa() {
        return rucEmpresa;
    }

    public void setRucEmpresa(String rucEmpresa) {
        this.rucEmpresa = rucEmpresa;
    }

    public String getCuentaPrincipal() {
        return cuentaPrincipal;
    }

    public void setCuentaPrincipal(String cuentaPrincipal) {
        this.cuentaPrincipal = cuentaPrincipal;
    }

    public BigDecimal getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(BigDecimal valorTotal) {
        this.valorTotal = valorTotal;
    }

    public BigDecimal getValorReal() {
        return valorReal;
    }

    public void setValorReal(BigDecimal valorReal) {
        this.valorReal = valorReal;
    }

    public List<EmpleadosPago> getEmpleadosPago() {
        return empleadosPago;
    }

    public void setEmpleadosPago(List<EmpleadosPago> empleadosPago) {
        this.empleadosPago = empleadosPago;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((rucEmpresa == null) ? 0 : rucEmpresa.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        PagoRol other = (PagoRol) obj;
        if (rucEmpresa == null) {
            if (other.rucEmpresa != null)
                return false;
        } else if (!rucEmpresa.equals(other.rucEmpresa))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "PagoRol [mes=" + mes + ", fechaProceso=" + fechaProceso + ", rucEmpresa=" + rucEmpresa
                + ", cuentaPrincipal=" + cuentaPrincipal + ", valorTotal=" + valorTotal + ", valorReal=" + valorReal
                + ", empleadosPago=" + empleadosPago + "]";
    }

    
    
    
    

    
}
