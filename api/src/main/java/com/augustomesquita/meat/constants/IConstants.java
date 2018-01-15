/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.augustomesquita.meat.constants;

/**
 *
 * @author augusto
 */
public interface IConstants {

    // KEY DE VARIÁVEIS DA SESSÃO
    String SESSION_USER_LOGGED = "userLogged";
    String SESSION_CURRENT_URL = "currentURL";
    String SESSION_PERMISSION_ERROR = "permissionError";

    // PREFIXOS 
    String WEB_APP_BASE_URL = "/";
    String WEB_LOGS_FILE = "todo-web-logs";

    // GRUPOS (GUIAS) DO APLICATIVO WEB
    String GROUP_GOVERNANCE_PERMISSION = "Governance";
    String GROUP_REPORT_PERMISSION = "Report";
    String GROUP_REGISTER_PERMISSION = "Register";
    String GROUP_REGISTER_BOT = "Bot";
    String GROUP_OTHERS_PERMISSION = "Others";
}
