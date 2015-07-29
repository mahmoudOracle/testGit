package view.beans;

import javax.faces.context.FacesContext;

import oracle.adf.view.rich.component.rich.nav.RichButton;

import org.apache.myfaces.trinidad.util.ComponentReference;

public class PatternForObtainingAdfComponentForJavaScript {
    private RichButton clinetButtonForJavaScript;

    public PatternForObtainingAdfComponentForJavaScript() {
    }

    public void setClinetButtonForJavaScript(RichButton clinetButtonForJavaScript) {
        this.clinetButtonForJavaScript = clinetButtonForJavaScript;
    }

    public RichButton getClinetButtonForJavaScript() {
        return clinetButtonForJavaScript;
    }
    
    private ComponentReference clientButton;
      public void setClientButton(RichButton clientButton){
        this.clientButton = ComponentReference.newUIComponentReference(clientButton);
      }

      public RichButton getClientButton(){
        if (clientButton != null){
         return (RichButton)clientButton.getComponent();
        }
        else{
         return null;
        }
      }
      
    public String getClientButtonClientId(){
        FacesContext ctx = FacesContext.getCurrentInstance();
        return this.getClientButton().getClientId(ctx);
      }
    
    public String getClientButtonClientId1(){
        FacesContext ctx = FacesContext.getCurrentInstance();
        return this.clinetButtonForJavaScript.getClientId(ctx);
      }
    
    
}
