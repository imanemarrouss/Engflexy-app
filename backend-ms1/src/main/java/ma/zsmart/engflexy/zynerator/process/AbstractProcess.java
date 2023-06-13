package ma.zsmart.engflexy.zynerator.process;

import ma.zsmart.engflexy.zynerator.audit.AuditBusinessObject;

public interface AbstractProcess<I extends AbstractProcessInput, K extends AbstractProcessOutput, T extends AuditBusinessObject> {
    Result<I, K, T> execute(I input);
}
